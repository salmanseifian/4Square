package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.model.SearchVenuesResponse
import kotlinx.coroutines.flow.Flow

interface FSRepository {

    fun searchVenues(ll: String): Flow<Result<SearchVenuesResponse>>

}