package com.salmanseifian.foursquare.ui

import android.Manifest.permission.*
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.salmanseifian.foursquare.R
import com.salmanseifian.foursquare.databinding.FragmentMapsBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MapsFragment : Fragment(R.layout.fragment_maps), OnMapReadyCallback {

    private val viewModel: MapsViewModel by activityViewModels()
    private lateinit var mapView: MapView
    private lateinit var googleMap: GoogleMap

    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private lateinit var settingClient: SettingsClient

    private lateinit var locationRequest: LocationRequest

    private lateinit var locationSettingsRequest: LocationSettingsRequest

    private lateinit var locationCallback: LocationCallback


    @SuppressLint("MissingPermission")
    private val requestMultiplePermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            if (permissions[ACCESS_FINE_LOCATION] == true && permissions[ACCESS_COARSE_LOCATION] == true) {
                startLocationUpdates()
                googleMap.isMyLocationEnabled = true
            } else {
                requestPermissions()
            }
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMapsBinding.bind(view)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        mapView = binding.mapView
        mapView.onCreate(savedInstanceState)
        mapView.onResume()

        MapsInitializer.initialize(requireContext())

        mapView.getMapAsync(this)

        viewModel.venues.observe(viewLifecycleOwner, {
            googleMap.clear()
            it.forEach { venue ->
                val venueMarker = googleMap.addMarker(
                    MarkerOptions()
                        .title(venue.name)
                        .position(LatLng(venue.location?.lat!!, venue.location.lng!!))
                )
                venueMarker.tag = venue.id
            }

        })

        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == AppCompatActivity.RESULT_OK) {
                if (checkPermissions()) {
                    startLocationUpdates()
                } else {
                    requestPermissions()
                }
            }
        }
    }


    override fun onMapReady(map: GoogleMap) {
        googleMap = map

        googleMap.uiSettings.isMyLocationButtonEnabled = true

        googleMap.setOnCameraIdleListener {
            viewModel.onUserViewPortUpdated(map.projection.visibleRegion.latLngBounds)
        }

        googleMap.setOnMarkerClickListener {
            findNavController().navigate(
                MapsFragmentDirections.actionMapsFragmentToVenueDetailsFragment(
                    it.tag as String
                )
            )
            return@setOnMarkerClickListener true
        }


        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireActivity())
        settingClient = LocationServices.getSettingsClient(requireActivity())


        createLocationCallback()
        createLocationRequest()
        buildLocationSettingsRequest()

        if (checkPermissions()) {
            startLocationUpdates()
        } else {
            requestPermissions()
        }
    }

    private fun createLocationCallback() {
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                locationResult ?: return
                onNewLocation(locationResult.lastLocation)
                stopLocationUpdates()
            }
        }
    }

    private fun createLocationRequest() {
        locationRequest = LocationRequest.create().apply {
            priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
        }
    }

    private fun buildLocationSettingsRequest() {
        val builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(locationRequest)
        locationSettingsRequest = builder.build()
    }


    private fun onNewLocation(location: Location) {
        googleMap.moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(
                    location.latitude,
                    location.longitude
                ), DEFAULT_ZOOM
            )
        )
    }


    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        settingClient.checkLocationSettings(locationSettingsRequest)
            .addOnSuccessListener {
                fusedLocationClient.requestLocationUpdates(
                    locationRequest,
                    locationCallback,
                    Looper.getMainLooper()
                )
            }
            .addOnFailureListener {
                if (it is ResolvableApiException) {
                    it.startResolutionForResult(requireActivity(), REQUEST_CHECK_SETTINGS)
                }
            }
    }

    private fun stopLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }


    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
        stopLocationUpdates()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    private fun checkPermissions(): Boolean {
        return checkSelfPermission(
            requireContext(),
            ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED && checkSelfPermission(
            requireContext(),
            ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun requestPermissions() {
        requestMultiplePermissions.launch(arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION))
    }


    companion object {
        private const val DEFAULT_ZOOM = 15f

        private const val REQUEST_CHECK_SETTINGS = 102
    }
}