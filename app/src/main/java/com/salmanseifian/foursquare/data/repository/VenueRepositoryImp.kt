package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.data.remote.ApiService
import com.salmanseifian.foursquare.di.IoDispatcher
import com.salmanseifian.foursquare.model.SearchVenuesResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import java.io.IOException
import javax.inject.Inject

const val DELAY_ONE_SECOND = 1_000L

class VenueRepositoryImp @Inject constructor(
    private val apiService: ApiService,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : VenueRepository {


    override fun searchVenues(ll: String): Flow<Result<SearchVenuesResponse>> {
        return flow {
            emit(Result.success(apiService.searchVenues(ll = ll)))
        }
            .catch {
                emit(Result.failure(it))
            }
            .flowOn(ioDispatcher)
    }

    override fun searchVenuesRetryIfFailed(ll: String): Flow<Result<SearchVenuesResponse>> {
        return flow {
            emit(Result.success(apiService.searchVenues(ll = ll)))
        }
            .retry(retries = 2) { t ->
                (t is IOException).also {
                    if (it) delay(DELAY_ONE_SECOND)
                }
            }
            .catch { emit(Result.failure(it)) }
            .flowOn(ioDispatcher)
    }
}