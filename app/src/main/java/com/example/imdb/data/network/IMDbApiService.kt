package com.example.imdb.data.network

import com.example.imdb.data.dto.MoviesSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApiService {
    @GET("/en/API/SearchMovie/k_vdtw8mj9/{expression}")
    fun searchMovies(@Path("expression") expression: String): Call<MoviesSearchResponse>
}