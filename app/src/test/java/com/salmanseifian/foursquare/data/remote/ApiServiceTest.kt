package com.salmanseifian.foursquare.data.remote

import com.salmanseifian.foursquare.sampleLatLng
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@RunWith(JUnit4::class)
class ApiServiceTest {

    private lateinit var apiService: ApiService


    @Before
    fun createService() {
        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))

        apiService = Retrofit.Builder()
            .baseUrl(ApiService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient.build())
            .build()
            .create(ApiService::class.java)
    }


    @Test
    fun searchVenues() {
        val response = runBlocking {
            apiService.searchVenues(ll = sampleLatLng)
        }
        Assert.assertEquals(200, response.meta?.code)
    }


}