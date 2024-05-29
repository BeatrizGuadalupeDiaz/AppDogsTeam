package com.example.appdogsteam.ui.randomDogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appdogsteam.model.repository.DogsRepository
import com.example.appdogsteam.model.response.ResponseRandomDogs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DogsViewModel (private val dogsRepository: DogsRepository = DogsRepository()) : ViewModel() {

    val data = MutableLiveData<ResponseRandomDogs>()

    fun getImageDogs() {
        CoroutineScope(Dispatchers.IO).launch {
            val result = dogsRepository.getImageDog()
            data.postValue(result.body())
        }
    }
}