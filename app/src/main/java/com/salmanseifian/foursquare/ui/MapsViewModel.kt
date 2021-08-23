package com.salmanseifian.foursquare.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.salmanseifian.foursquare.data.repository.FSRepository
import com.salmanseifian.foursquare.model.Venue
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(private val fsRepository: FSRepository) : ViewModel() {

    val allVenues = mutableSetOf<Venue>()

    private val _venues = MutableLiveData<List<Venue>>()
    val venues: LiveData<List<Venue>> = _venues


    private val _isLoading = MutableLiveData(true)
    val isLoading: LiveData<Boolean> = _isLoading

    fun onUserViewPortUpdated(bounds: LatLngBounds) {
        filterVenues(bounds)
        searchVenues(bounds)
    }


    private fun filterVenues(bounds: LatLngBounds) {
        val inBoundsVenues = allVenues.filter { venue ->
            bounds.contains(
                LatLng(
                    venue.location?.lat!!,
                    venue.location.lng!!
                )
            )
        }

        if (inBoundsVenues.isNotEmpty()) {
            _venues.value = inBoundsVenues
        }


    }

    private fun searchVenues(bounds: LatLngBounds) {
        val ll = bounds.center.latitude.toString() + "," + bounds.center.longitude.toString()
        viewModelScope.launch {
            fsRepository.searchVenues(ll)
                .collect { result ->
                    when {
                        result.isSuccess -> {
                            _isLoading.value = false

                            result.getOrNull()?.let {
                                allVenues.addAll(it.response?.venues ?: emptyList())
                                filterVenues(bounds)
                            }
                        }

                        result.isFailure -> {
                            _isLoading.value = false
                            result.exceptionOrNull()?.printStackTrace()
                        }
                    }
                }


        }
    }

}