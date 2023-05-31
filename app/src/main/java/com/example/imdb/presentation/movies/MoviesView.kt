package com.example.imdb.presentation.movies

import com.example.imdb.ui.movies.models.MoviesState

interface MoviesView {
    fun render(state: MoviesState)

    fun showToast(additionalMessage: String)
}