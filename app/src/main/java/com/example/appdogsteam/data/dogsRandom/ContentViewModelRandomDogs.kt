package com.example.appdogsteam.data.dogsRandom

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appdogsteam.model.repository.RepositoryDogsRandom
import com.example.appdogsteam.model.response.ResponseRandomDogs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
class ContentViewModelRandomDogs(private val dogsRepositoryDogsRandom: RepositoryDogsRandom = RepositoryDogsRandom()):ViewModel(){
    val data = MutableLiveData<ResponseRandomDogs>()

    fun getImageDogRandom(){
        CoroutineScope(Dispatchers.IO).launch {
            val result = dogsRepositoryDogsRandom.getImageDogs()
            data.postValue(result.body())
        }
    }
}