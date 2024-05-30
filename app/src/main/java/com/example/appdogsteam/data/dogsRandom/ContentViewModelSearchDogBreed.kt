package com.example.appdogsteam.data.dogsRandom

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appdogsteam.model.repository.RepositorySearchDogsBreed
import com.example.appdogsteam.model.response.ResponseRandomDogs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
class ContentViewModelSearchDogBreed(private val dogsRepositorySearchDogsBreed: RepositorySearchDogsBreed=RepositorySearchDogsBreed()):ViewModel(){
    val data = MutableLiveData<ResponseRandomDogs>()

    fun getImageDogBreed(breedDog: String = "boxer") {
        CoroutineScope(Dispatchers.IO).launch {
            val result = dogsRepositorySearchDogsBreed.getImageDogBreed(breedDog)
            data.postValue(result.body())
        }
    }
}