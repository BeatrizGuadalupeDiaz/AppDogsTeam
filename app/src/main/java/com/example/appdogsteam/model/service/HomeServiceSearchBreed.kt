package com.example.appdogs.model.service

import com.example.appdogsteam.model.response.ResponseRandomDogs
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface HomeServiceSearchBreed {
    @GET("{dogName}/images/random")
    suspend fun getImageSearchDogsBreed(@Path("dogName") dogName: String): Response<ResponseRandomDogs>

}