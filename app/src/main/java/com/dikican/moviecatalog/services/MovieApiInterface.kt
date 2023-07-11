package com.dikican.moviecatalog.services

import retrofit2.Call
import com.dikican.moviecatalog.models.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=3bb3eea50e794e552036764f84712eb3")
    fun getMovieList(): Call<MovieResponse>

}