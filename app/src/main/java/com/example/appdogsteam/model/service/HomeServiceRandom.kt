package com.example.appdogs.model.service

import com.example.appdogsteam.model.response.ResponseRandomDog
import retrofit2.Response
import retrofit2.http.GET

interface HomeServiceRandom {
    //get ramdom image
    @GET("image/random")
    suspend fun getImageRandomDogs(): Response<ResponseRandomDog>

}