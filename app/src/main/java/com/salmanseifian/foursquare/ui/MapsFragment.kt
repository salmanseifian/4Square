package com.salmanseifian.foursquare.ui

import android.Manifest
import android.annotation.SuppressLint
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.gms.tasks.Task
import com.salmanseifian.foursquare.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapsFragment : Fragment(), OnMapReadyCallback {

    private val viewModel: MapsViewModel by viewModels()
    private var mapView: MapView? = null
    private lateinit var map: GoogleMap

    private val fusedLocationClient by lazy {
        LocationServices.getFusedLocationProviderClient(requireActivity())
    }

    private val locationCallback by lazy {
        object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                locationResult ?: return
                onNewLocation(locationResult.locations.first())
                stopLocationUpdates()
            }
        }
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mapView = view.findViewById<MapView>(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.onResume()

        MapsInitializer.initialize(requireContext())

        mapView.getMapAsync(this)

        viewModel.venues.observe(viewLifecycleOwner, {
            map.clear()
            it.forEach { venue ->
                map.addMarker(
                    MarkerOptions()
                        .title(venue.name)
                        .position(LatLng(venue.location?.lat!!, venue.location.lng!!))
                )
            }

        })

        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == AppCompatActivity.RESULT_OK) {
                startLocationUpdates()
            } else {
                checkLocationSetting()
            }
        }

    }

    override fun onMapReady(map: GoogleMap) {
        this.map = map

        map.setOnCameraIdleListener {
            viewModel.onUserViewPortUpdated(map.projection.visibleRegion.latLngBounds)
        }

        fetchLastLocation()

        checkLocationSetting()
    }

    @SuppressLint("MissingPermission")
    private fun fetchLastLocation() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_COARSE_LOCATION
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
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ),
                123
            )
        }
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
                val builder = AlertDialog.Builder(requireActivity())
                builder.setTitle("Continiuos Location Request")
                builder.setMessage("This request is essential to get location update continiously")
                builder.create()
                builder.setPositiveButton(
                    "OK"
                ) { _, _ ->
                    try {
                        e.startResolutionForResult(requireActivity(), REQUEST_CHECK_SETTINGS)
                    } catch (e1: IntentSender.SendIntentException) {
                        e1.printStackTrace()
                    }
                }
                builder.setNegativeButton(
                    "Cancel"
                ) { _, _ ->
                    Toast.makeText(
                        requireContext(),
                        "Location update permission not granted",
                        Toast.LENGTH_LONG
                    ).show()
                }
                builder.show()
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(
                    requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION
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


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            123 -> {
                if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                    showPermissionAlert()
                } else {
                    if (ActivityCompat.checkSelfPermission(
                            requireContext(),
                            Manifest.permission.ACCESS_FINE_LOCATION
                        ) == PackageManager.PERMISSION_GRANTED
                        && ActivityCompat.checkSelfPermission(
                            requireContext(),
                            Manifest.permission.ACCESS_COARSE_LOCATION
                        ) == PackageManager.PERMISSION_GRANTED
                    ) {
                        fetchLastLocation()
                    }
                }
            }
        }
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