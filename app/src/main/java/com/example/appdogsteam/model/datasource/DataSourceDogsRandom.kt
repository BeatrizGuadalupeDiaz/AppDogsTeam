package com.example.appdogsteam.model.datasource

import com.example.appdogs.model.service.HomeServiceRandom
import com.example.appdogsteam.model.response.ResponseRandomDogs
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataSourceDogsRandom {
    private val url = "https://dog.ceo/api/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val serviceDogs = retrofit.create(HomeServiceRandom
    ::class.java)
    suspend fun getImageRandom():Response<ResponseRandomDogs>{
        return serviceDogs.getImageRandomDogs()
    }
}