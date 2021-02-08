package com.example.preworkshopdsc.di

import com.example.preworkshopdsc.data.service.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class ApiServicesModule {
    @Provides
    @Singleton
    fun providesMovieService(retrofit: Retrofit): MovieService = retrofit.create(MovieService::class.java)
}