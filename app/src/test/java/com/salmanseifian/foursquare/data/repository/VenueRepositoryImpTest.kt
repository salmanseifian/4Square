package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.data.remote.ApiService
import com.salmanseifian.foursquare.sampleLatLng
import com.salmanseifian.foursquare.sampleResponse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeTrue
import org.junit.Test
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import java.io.IOException

class VenueRepositoryImpTest {


    private val testDispatcher = TestCoroutineDispatcher()


    @Test
    fun `should get venues on success`() = runBlocking {

        val apiService = mock<ApiService> {
            onBlocking { searchVenues(latLng = sampleLatLng) } doReturn sampleResponse()
        }

        val repository = VenueRepositoryImp(apiService, testDispatcher)

        val flow = repository.searchVenues(sampleLatLng)

        flow.collect { result ->
            result.isSuccess.shouldBeTrue()
            result.onSuccess { it shouldBeEqualTo sampleResponse() }
        }
    }


    @Test
    fun `should throw error for search venues if any exception is thrown`() =
        testDispatcher.runBlockingTest {

            val apiService = mock<ApiService> {
                onBlocking { searchVenues(latLng = sampleLatLng) } doAnswer {
                    throw IOException()
                }
            }

            val repository = VenueRepositoryImp(apiService, testDispatcher)

            val flow = repository.searchVenues(sampleLatLng)


            flow.collect { result ->
                result.isFailure.shouldBeTrue()
            }

        }



    @Test
    fun `should retry and second retry succeeded`() = testDispatcher.runBlockingTest {

        var throwError = true

        val apiService = mock<ApiService> {
            onBlocking { searchVenues(latLng = sampleLatLng) } doAnswer {
                if (throwError) throw IOException() else sampleResponse()
            }
        }

        val repository = VenueRepositoryImp(apiService, testDispatcher)

        val flow = repository.searchVenues(sampleLatLng)


        launch {
            flow.collect { result ->
                result.isSuccess.shouldBeTrue()
            }
        }

        advanceTimeBy(DELAY_ONE_SECOND)

        throwError = false
        advanceTimeBy(DELAY_ONE_SECOND)


    }


}