package com.salmanseifian.foursquare.ui

import android.Manifest.permission.*
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import android.os.Build
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
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.gms.tasks.Task
import com.salmanseifian.foursquare.R
import com.salmanseifian.foursquare.databinding.FragmentMapsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapsFragment : Fragment(R.layout.fragment_maps), OnMapReadyCallback {

    private val viewModel: MapsViewModel by activityViewModels()
    private var mapView: MapView? = null
    private lateinit var map: GoogleMap
    private lateinit var locationCallback: LocationCallback

    private val fusedLocationClient by lazy {
        LocationServices.getFusedLocationProviderClient(requireActivity())
    }


    private fun locationRequest(): LocationRequest {
        return LocationRequest.create().apply {
            interval = UPDATE_INTERVAL
            fastestInterval = FASTEST_UPDATE_INTERVAL
            maxWaitTime = MAX_WAIT_TIME
            priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
        }
    }

    private val locationSettingsRequest by lazy {
        LocationSettingsRequest.Builder()
            .addLocationRequest(locationRequest())
    }

    private val requestMultiplePermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            if (permissions[ACCESS_FINE_LOCATION] == true && permissions[ACCESS_COARSE_LOCATION] == true) {
                fetchLastLocation()
            } else {
                showPermissionAlert()
            }
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMapsBinding.bind(view)

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
                startLocationUpdates()
            } else {
                checkLocationSetting()
            }
        }

        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                locationResult ?: return
                onNewLocation(locationResult.locations.first())
                stopLocationUpdates()
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

        fetchLastLocation()

        checkLocationSetting()


    }

    @SuppressLint("MissingPermission")
    private fun fetchLastLocation() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(
                    requireContext(),
                    ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(
                    requireContext(),
                    ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                showPermissionAlert()
                return
            }
        }
        fusedLocationClient.lastLocation
            .addOnSuccessListener(
                requireActivity()
            ) { location ->
                if (location != null) {
                    onNewLocation(location)
                }
            }

    }

    private fun showPermissionAlert() {
        requestMultiplePermissions.launch(arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION))
    }


    private fun onNewLocation(location: Location) {
        map.moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(
                    location.latitude,
                    location.longitude
                ), DEFAULT_ZOOM.toFloat()
            )
        )
    }


    private fun stopLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }


    private fun checkLocationSetting() {
        val client = LocationServices.getSettingsClient(requireActivity())
        val task: Task<LocationSettingsResponse> =
            client.checkLocationSettings(locationSettingsRequest.build())
        task.addOnSuccessListener(
            requireActivity(),
            OnSuccessListener {
                startLocationUpdates()
                return@OnSuccessListener
            })
        task.addOnFailureListener(requireActivity()) { e ->
            if (e is ResolvableApiException) {
                e.startResolutionForResult(requireActivity(), REQUEST_CHECK_SETTINGS)
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(
                    requireContext(),
                    ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(
                    requireContext(), ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                showPermissionAlert()
            }
        }
        fusedLocationClient.requestLocationUpdates(
            locationRequest(),
            locationCallback,
            Looper.getMainLooper()
        )
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


    companion object {
        private const val DEFAULT_ZOOM = 15

        private const val REQUEST_CHECK_SETTINGS = 102
        private const val UPDATE_INTERVAL = (10 * 1000).toLong()
        private const val FASTEST_UPDATE_INTERVAL = (UPDATE_INTERVAL / 2)
        private const val MAX_WAIT_TIME = UPDATE_INTERVAL * 3
    }
}