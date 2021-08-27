package com.salmanseifian.foursquare.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.salmanseifian.foursquare.*
import com.salmanseifian.foursquare.data.repository.VenueRepository
import com.salmanseifian.foursquare.model.SearchVenuesResponse
import com.salmanseifian.foursquare.model.Venue
import com.salmanseifian.foursquare.threading.CoroutineTestRule
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
import java.net.SocketTimeoutException

class MapsViewModelTest {

    @get:Rule
    val rule = CoroutineTestRule()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private val fsRepository = mock<VenueRepository>()

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

        val result = Result.success(sampleResponse())

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


    @Test
    fun `should emit from cache on inbounds location`() = rule.dispatcher.runBlockingTest {

        val result = Result.success(sampleResponse())

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

        viewModel.onUserViewPortUpdated(sampleOverlappingLatLngBounds)

        verify(fsRepository, times(1)).searchVenues(sampleOverlappingLatLng)

        verify(loadingObserver).onChanged(false)
        verify(venuesObserver).onChanged(sampleVenues)


    }



    @ExperimentalCoroutinesApi
    @Test
    fun `should hide loading on failure`() = rule.dispatcher.runBlockingTest {

        val result = Result.failure<SocketTimeoutException>(SocketTimeoutException())

        val channel = Channel<Result<Throwable>>()
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
    }
}