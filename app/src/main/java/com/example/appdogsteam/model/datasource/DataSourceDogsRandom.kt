package com.example.appdogsteam.model.datasource

import com.example.appdogs.model.service.HomeServiceRandom
import com.example.appdogsteam.model.response.ResponseDogs
import com.example.appdogsteam.model.response.ResponseRandomDogs
import com.example.appdogsteam.model.service.HomeServiceInicio
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataSourceDogsRandom {
    private val urlBase = "https://dog.ceo/api/breeds/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(urlBase)
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val serviceDogs = retrofit.create(HomeServiceRandom
    ::class.java)

    private val dogsService = retrofit.create(HomeServiceInicio::class.java)

    suspend fun getImageDogs(): Response<ResponseDogs> {
        return dogsService.getImageDogs()
    }
    suspend fun getImageRandom():Response<ResponseRandomDogs>{
        return serviceDogs.getImageRandomDogs()
    }
}