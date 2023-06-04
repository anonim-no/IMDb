package com.example.imdb.ui.movies.models

import com.example.imdb.domain.models.Movie

sealed interface MoviesState {

    object Loading : MoviesState

    data class Content(
        val movies: List<Movie>
    ) : MoviesState

    data class Error(
        val message: String
    ) : MoviesState

    data class Empty(
        val errorMessage: String
    ) : MoviesState

}
