package com.salmanseifian.foursquare.data.repository

import com.salmanseifian.foursquare.data.remote.FSService
import com.salmanseifian.foursquare.model.SearchVenuesResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class FSRepositoryImp @Inject constructor(
    private val fsService: FSService,
    private val ioDispatcher: CoroutineDispatcher
) : FSRepository {


    override fun searchVenues(ll: String): Flow<Result<SearchVenuesResponse>> {
        return flow {
            emit(Result.success(fsService.searchVenues(ll = ll)))
        }
            .catch { emit(Result.failure(it)) }
            .flowOn(ioDispatcher)
    }
}