package com.example.appdogsteam.model.repository

import com.example.appdogsteam.model.datasource.DataSourceDogsRandom
import com.example.appdogsteam.model.response.ResponseRandomDog
import retrofit2.Response

class RepositoryDogsRandom(private val dataSourceDogsRandom: DataSourceDogsRandom = DataSourceDogsRandom()) {
    suspend fun getImageDogs(): Response<ResponseRandomDog> {
        return dataSourceDogsRandom.getImageRandom()
    }
}
