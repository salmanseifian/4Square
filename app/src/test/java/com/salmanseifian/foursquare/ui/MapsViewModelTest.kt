package com.salmanseifian.foursquare.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.salmanseifian.foursquare.*
import com.salmanseifian.foursquare.data.repository.FSRepository
import com.salmanseifian.foursquare.model.SearchVenuesResponse
import com.salmanseifian.foursquare.model.Venue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

class MapsViewModelTest {

    @get:Rule
    val rule = CoroutineTestRule()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private val fsRepository = mock<FSRepository>()

    private val venuesObserver = mock<Observer<List<Venue>>>()
    private val loadingObserver = mock<Observer<Boolean>>()


    private lateinit var viewModel: MapsViewModel


    @Before
    fun setUp() {
        viewModel = MapsViewModel(fsRepository).apply {
            venues.observeForever(venuesObserver)
            isLoading.observeForever(loadingObserver)
        }
    }


    @ExperimentalCoroutinesApi
    @Test
    fun `should emit venues on success`() = rule.dispatcher.runBlockingTest {

        val result = Result.success(response())

        val channel = Channel<Result<SearchVenuesResponse>>()
        val flow = channel.consumeAsFlow()

        doReturn(flow)
            .`when`(fsRepository)
            .searchVenues(sampleLatLng)

        launch {
            channel.send(result)
        }

        viewModel.onUserViewPortUpdated(sampleLatLngBounds)

        verify(fsRepository, times(1)).searchVenues(sampleLatLng)


        verify(loadingObserver).onChanged(false)
        verify(venuesObserver).onChanged(sampleVenues)


    }


    private fun response(): SearchVenuesResponse {
        val gson = Gson()
        return gson.fromJson(
            sampleJsonResponse,
            SearchVenuesResponse::class.java
        )
    }


}