package com.example.appdogsteam.model.repository

import com.example.appdogsteam.model.datasource.DataSourceDogsRandom
import com.example.appdogsteam.model.datasource.DogsDataSource
import com.example.appdogsteam.model.response.ResponseRandomDogs
import retrofit2.Response

class DogsRepository(private val dogsDataSource: DogsDataSource = DogsDataSource()) {

   suspend fun getImageDog(): Response<ResponseRandomDogs>{
       return dogsDataSource.getImageDogs()
   }

}