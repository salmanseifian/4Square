package com.salmanseifian.foursquare.data.remote

import com.salmanseifian.foursquare.model.SearchVenuesResponse
import com.salmanseifian.foursquare.utils.CLIENT_ID
import com.salmanseifian.foursquare.utils.CLIENT_SECRET
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FSService {

    @GET("/v2/venues/search")
    suspend fun searchVenues(
        @Query("client_id") clientId: String = CLIENT_ID,
        @Query("client_secret") clientSecret: String = CLIENT_SECRET,
        @Query("v") version: String = VERSION,
        @Query("categoryId") categoryId: String = FOOD_CATEGORY_ID,
        @Query("ll") ll: String
    ): SearchVenuesResponse


    companion object {
        const val BASE_URL = "https://api.foursquare.com"
        private const val VERSION = "20210817"
        private const val FOOD_CATEGORY_ID = "4d4b7105d754a06374d81259"

    }

}