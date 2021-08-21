package com.salmanseifian.foursquare.di

import com.salmanseifian.foursquare.data.repository.FSRepository
import com.salmanseifian.foursquare.data.repository.FSRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped


@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class RepositoryModule {

    @ActivityRetainedScoped
    @Binds
    abstract fun bindRepository(impl: FSRepositoryImp): FSRepository

}