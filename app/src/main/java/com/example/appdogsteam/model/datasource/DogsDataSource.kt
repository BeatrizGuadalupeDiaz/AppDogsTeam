package com.example.appdogsteam.model.datasource

import com.example.appdogs.model.service.HomeServiceRandom
import com.example.appdogsteam.model.response.ResponseRandomDogs
import com.example.appdogsteam.model.service.HomeServiceInicio
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DogsDataSource {

    private val url = "https://dog.ceo/api/breed/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val dogsService = retrofit.create(HomeServiceInicio::class.java)
    suspend fun getImageDogs(): Response<ResponseRandomDogs> {
        return dogsService.getImageDogsHome()
}
}