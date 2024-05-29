package com.example.appdogsteam.ui.randomDogs.viewmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appdogsteam.R
import com.example.appdogsteam.data.dogsRandom.ContentViewModelRandomDogs
import com.example.appdogsteam.databinding.ActivityMainDogsRandomBinding
import com.squareup.picasso.Picasso

class MainActivityDogsRandom : AppCompatActivity() {
    private val viewModel by viewModels<ContentViewModelRandomDogs>()
    private lateinit var binding: ActivityMainDogsRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainDogsRandomBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        callRandomDogs()
        observerRandomDogs()
        actions()
        navigation()
    }
    private fun callRandomDogs() {
        viewModel.getImageDogRandom()
    }
    private fun observerRandomDogs() {
        viewModel.data.observe(this) {
            val imageUrl = it.data
            Picasso.get().load(imageUrl).into(binding.imgBtnDog)
        }
        /*.data.observe(this) { result ->
            val imageUrl = result.data
            Glide.with(this)
                .load(imageUrl)
                .apply(RequestOptions.bitmapTransform(CircleCrop()))
                .into(binding.imgBtnDog)
        }

         */
    }
    private fun actions(){
        binding.btnHuellita.setOnClickListener{
            callRandomDogs()
        }
    }
    private fun navigation(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}