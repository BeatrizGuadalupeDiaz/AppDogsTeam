package com.example.appdogsteam.ui.randomDogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appdogsteam.model.repository.DogsRepository
import com.example.appdogsteam.model.response.ResponseDogs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DogsViewModel(private val dogsRepository: DogsRepository = DogsRepository()) :ViewModel() {

    val data = MutableLiveData<ResponseDogs>()

    fun getImageDogs(){
        CoroutineScope(Dispatchers.IO).launch {
            val result = dogsRepository.getImageDogs()
            data.postValue(result.body())
        }
    }
}