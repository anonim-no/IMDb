package com.example.imdb

import android.app.Application
import com.example.imdb.presentation.movies.MoviesSearchPresenter

class MoviesApplication : Application() {

    var moviesSearchPresenter : MoviesSearchPresenter? = null

}