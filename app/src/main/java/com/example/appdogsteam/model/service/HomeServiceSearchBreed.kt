package com.example.appdogs.model.service

import com.example.appdogsteam.data.dogsRandom.DogName
import com.example.appdogsteam.model.response.ResponseRandomDog
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Part
import retrofit2.http.Path

interface HomeServiceSearchBreed {
    @GET("{dogName}/images/random")
    suspend fun getImageSearchDogsBreed(@Path("dogName") dogName: String): Response<ResponseRandomDog>

}