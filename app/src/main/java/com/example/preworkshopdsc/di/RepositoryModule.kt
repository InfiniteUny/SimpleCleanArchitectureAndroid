package com.example.preworkshopdsc.di

import com.example.preworkshopdsc.data.repository.MovieRepositoryImpl
import com.example.preworkshopdsc.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
interface RepositoryModule {
    @Binds
    fun bindMovieRepository(repository: MovieRepositoryImpl): MovieRepository
}