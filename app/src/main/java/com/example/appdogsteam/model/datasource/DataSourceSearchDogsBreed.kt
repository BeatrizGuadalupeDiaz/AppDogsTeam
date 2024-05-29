package com.example.appdogsteam.model.datasource

import com.example.appdogs.model.service.HomeServiceSearchBreed
import com.example.appdogsteam.data.dogsRandom.DogName
import com.example.appdogsteam.model.response.ResponseRandomDog
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataSourceSearchDogsBreed {
    private val url = "https://dog.ceo/api/breed/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val serviceDogs = retrofit.create(HomeServiceSearchBreed
    ::class.java)
    suspend fun getImageDogBreed():Response<ResponseRandomDog>{
        return serviceDogs.getImageSearchDogsBreed(DogName.dogName)
    }
}