package com.example.appdogsteam.model.repository

import com.example.appdogsteam.model.datasource.DataSourceSearchDogsBreed
import com.example.appdogsteam.model.response.ResponseRandomDog
import retrofit2.Response

class RepositorySearchDogsBreed(private val dataSourceSearchDogsBreed: DataSourceSearchDogsBreed = DataSourceSearchDogsBreed()) {
    suspend fun getImageDogBreed(): Response<ResponseRandomDog> {
        return dataSourceSearchDogsBreed.getImageDogBreed()
    }
}
