package com.example.appdogsteam.model.service

import com.example.appdogsteam.model.response.ResponseRandomDogs
import retrofit2.Response
import retrofit2.http.GET

interface HomeServiceInicio {

    @GET("image/random/3")
    suspend fun getImageDogsHome(): Response<ResponseRandomDogs>
}