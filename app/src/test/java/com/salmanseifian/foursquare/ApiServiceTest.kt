package com.salmanseifian.foursquare

import com.salmanseifian.foursquare.data.remote.FSService
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

    private lateinit var fsService: FSService


    @Before
    fun createService() {
        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))

        fsService = Retrofit.Builder()
            .baseUrl(FSService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient.build())
            .build()
            .create(FSService::class.java)
    }


    @Test
    fun searchVenues() {
        val response = runBlocking {
            fsService.searchVenues(ll = sampleLatLng)
        }
        Assert.assertEquals(200, response.meta?.code)
    }


}