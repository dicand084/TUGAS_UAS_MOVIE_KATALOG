package com.dikican.moviecatalog.services

import com.dikican.moviecatalog.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=3bb3eea50e794e552036764f84712eb3")
    fun getTVList(): Call<TVResponse>

}