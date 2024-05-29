package com.example.appdogsteam.model.repository

import com.example.appdogsteam.model.response.ResponseDogs
import retrofit2.Response

class DogsRepository(private val dogsDataSource: DogsDataSource = DogsDataSource()) {

    suspend fun getImageDogs(): Response<ResponseDogs> {
        return dogsDataSource.getImageDogs()
    }
}