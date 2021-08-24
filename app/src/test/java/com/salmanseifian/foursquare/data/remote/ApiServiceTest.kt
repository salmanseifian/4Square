package com.salmanseifian.foursquare.data.remote

import com.salmanseifian.foursquare.sampleLatLng
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
import org.amshove.kluent.internal.assertEquals
import org.amshove.kluent.internal.assertNotEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiServiceTest {
    private val mockWebServer = MockWebServer()

    private lateinit var apiService: ApiService


    @Before
    fun createService() {
        apiService = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }


    @After
    fun stopService() {
        mockWebServer.shutdown()
    }


    @Test
    fun `should return venues on success`() = runBlocking {

        enqueueResponse("venues.json")

        val response = apiService.searchVenues(ll = sampleLatLng)
        
        assertEquals(200, response.meta?.code)
        assertNotEquals(null, response.response)
        assertNotEquals(null, response.response?.venues)
        
        
        
    }


    private fun enqueueResponse(fileName: String, headers: Map<String, String> = emptyMap()) {
        val inputStream = javaClass.classLoader!!
            .getResourceAsStream("api-response/$fileName")
        val source = inputStream.source().buffer()

        val mockResponse = MockResponse()

        for ((key, value) in headers) {
            mockResponse.addHeader(key, value)
        }

        mockWebServer.enqueue(
            mockResponse
                .setBody(source.readString(Charsets.UTF_8))
        )
    }


}