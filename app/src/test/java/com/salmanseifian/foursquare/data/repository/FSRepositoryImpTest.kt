package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.data.remote.FSService
import com.salmanseifian.foursquare.sampleLatLng
import com.salmanseifian.foursquare.sampleResponse
import kotlinx.coroutines.flow.collect
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

class FSRepositoryImpTest {


    private val testDispatcher = TestCoroutineDispatcher()


    @Test
    fun `should get venues on success`() = runBlocking {

        val apiService = mock<FSService> {
            onBlocking { searchVenues(ll = sampleLatLng) } doReturn sampleResponse()
        }

        val repository = FSRepositoryImp(apiService, testDispatcher)

        val flow = repository.searchVenues(sampleLatLng)

        flow.collect { result ->
            result.isSuccess.shouldBeTrue()
            result.onSuccess { it shouldBeEqualTo sampleResponse() }
        }
    }


    @Test
    fun `should throw error for search venues if any exception is thrown`() =
        testDispatcher.runBlockingTest {

            val apiService = mock<FSService> {
                onBlocking { searchVenues(ll = sampleLatLng) } doAnswer {
                    throw IOException()
                }
            }

            val repository = FSRepositoryImp(apiService, testDispatcher)

            val flow = repository.searchVenues(sampleLatLng)


            flow.collect { result ->
                result.isFailure.shouldBeTrue()
            }

        }


}