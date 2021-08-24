package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.data.remote.ApiService
import com.salmanseifian.foursquare.di.IoDispatcher
import com.salmanseifian.foursquare.model.SearchVenuesResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class VenueRepositoryImp @Inject constructor(
    private val apiService: ApiService,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : VenueRepository {


    override fun searchVenues(ll: String): Flow<Result<SearchVenuesResponse>> {
        return flow {
            emit(Result.success(apiService.searchVenues(ll = ll)))
        }
            .catch { emit(Result.failure(it)) }
            .flowOn(ioDispatcher)
    }
}