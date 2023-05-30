package com.example.imdb.util

import android.content.Context
import com.example.imdb.data.MoviesRepositoryImpl
import com.example.imdb.data.network.RetrofitNetworkClient
import com.example.imdb.domain.api.MoviesInteractor
import com.example.imdb.domain.api.MoviesRepository
import com.example.imdb.domain.impl.MoviesInteractorImpl
import com.example.imdb.presentation.movies.MoviesSearchPresenter
import com.example.imdb.presentation.poster.PosterPresenter
import com.example.imdb.presentation.movies.MoviesView
import com.example.imdb.presentation.poster.PosterView

object Creator {
    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun provideMoviesSearchPresenter(
        moviesView: MoviesView,
        context: Context,
    ): MoviesSearchPresenter {
        return MoviesSearchPresenter(
            view = moviesView,
            context = context,
        )
    }

    fun providePosterPresenter(
        posterView: PosterView,
        imageUrl: String
    ): PosterPresenter {
        return PosterPresenter(posterView, imageUrl)
    }
}