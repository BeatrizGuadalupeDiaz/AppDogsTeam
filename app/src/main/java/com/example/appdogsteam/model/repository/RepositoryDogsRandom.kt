package com.example.appdogsteam.model.repository

import com.example.appdogsteam.model.datasource.DataSourceDogsRandom
import com.example.appdogsteam.model.response.ResponseRandomDogs
import retrofit2.Response

class RepositoryDogsRandom(private val dataSourceDogsRandom: DataSourceDogsRandom = DataSourceDogsRandom()) {
    suspend fun getImageDogs(): Response<ResponseRandomDogs> {
        return dataSourceDogsRandom.getImageRandom()
    }
}
