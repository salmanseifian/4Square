package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.model.SearchVenuesResponse
import kotlinx.coroutines.flow.Flow

interface VenueRepository {

    fun searchVenues(ll: String): Flow<Result<SearchVenuesResponse>>

}