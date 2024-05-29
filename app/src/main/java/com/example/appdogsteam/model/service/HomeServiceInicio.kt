package com.example.appdogsteam.model.service

import com.example.appdogsteam.model.response.ResponseDogs
import retrofit2.Response
import retrofit2.http.GET

interface HomeServiceInicio {

    @GET("image/random/3")
    suspend fun getImageDogs(): Response<ResponseDogs>
}