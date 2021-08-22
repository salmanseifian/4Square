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
    private var mapView: MapView? = null
    private lateinit var map: GoogleMap

    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private lateinit var settingClient: SettingsClient

    private lateinit var locationRequest: LocationRequest

    private lateinit var locationSettingsRequest: LocationSettingsRequest

    private lateinit var locationCallback: LocationCallback


    private val requestMultiplePermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            if (permissions[ACCESS_FINE_LOCATION] == true && permissions[ACCESS_COARSE_LOCATION] == true) {
                startLocationUpdates()
            } else {
                requestPermissions()
            }
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMapsBinding.bind(view)
        binding.viewModel = viewModel

        val mapView = binding.mapView
        mapView.onCreate(savedInstanceState)
        mapView.onResume()

        MapsInitializer.initialize(requireContext())

        mapView.getMapAsync(this)

        viewModel.venues.observe(viewLifecycleOwner, {
            map.clear()
            it.forEach { venue ->
                val venueMarker = map.addMarker(
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
        this.map = map

        map.setOnCameraIdleListener {
            viewModel.onUserViewPortUpdated(map.projection.visibleRegion.latLngBounds)
        }

        map.setOnMarkerClickListener {
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
            }
        }
    }

    private fun createLocationRequest() {
        locationRequest = LocationRequest.create().apply {
            interval = UPDATE_INTERVAL
            fastestInterval = FASTEST_UPDATE_INTERVAL
            maxWaitTime = MAX_WAIT_TIME
            priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
        }
    }

    private fun buildLocationSettingsRequest() {
        val builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(locationRequest)
        locationSettingsRequest = builder.build()
    }


    private fun onNewLocation(location: Location) {
        map.moveCamera(
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
        mapView?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView?.onPause()
        stopLocationUpdates()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView?.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView?.onLowMemory()
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
        private const val UPDATE_INTERVAL = (10 * 1000).toLong()
        private const val FASTEST_UPDATE_INTERVAL = (UPDATE_INTERVAL / 2)
        private const val MAX_WAIT_TIME = UPDATE_INTERVAL * 3
    }
}