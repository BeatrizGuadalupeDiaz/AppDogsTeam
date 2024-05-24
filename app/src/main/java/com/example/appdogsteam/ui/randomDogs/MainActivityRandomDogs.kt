package com.example.appdogsteam.ui.randomDogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.appdogsteam.data.dogsRandom.ContentViewModelRandomDogs
import com.example.appdogsteam.databinding.ActivityMainRandomDogsBinding
import com.squareup.picasso.Picasso

class MainActivityRandomDogs : AppCompatActivity() {

    private val viewModel by viewModels<ContentViewModelRandomDogs>()
    private lateinit var binding: ActivityMainRandomDogsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainRandomDogsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        callRandomDogs()
        observerRandomDogs()
    }

    private fun callRandomDogs() {
        viewModel.getImageDogRandom()
    }

    private fun observerRandomDogs() {
        viewModel.data.observe(this) {
            val imageUrl = it.data
            Picasso.get().load(imageUrl).into(binding.imgBtnDog)
        }
    }
}
