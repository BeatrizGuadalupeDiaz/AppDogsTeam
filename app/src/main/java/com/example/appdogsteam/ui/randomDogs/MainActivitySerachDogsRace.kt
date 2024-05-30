package com.example.appdogsteam.ui.randomDogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appdogsteam.R
import com.example.appdogsteam.data.dogsRandom.ContentViewModelSearchDogBreed
import com.example.appdogsteam.databinding.ActivityMainSerachDogsRaceBinding
import com.squareup.picasso.Picasso

class MainActivitySerachDogsRace : AppCompatActivity() {
    private val viewModel by viewModels<ContentViewModelSearchDogBreed>()
    private lateinit var binding: ActivityMainSerachDogsRaceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainSerachDogsRaceBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        callSearchDogBreed()
        observerSearchDogBreed()
        actions()
        navigation()
    }

    private fun callSearchDogBreed() {
        viewModel.getImageDogBreed()
    }

    private fun observerSearchDogBreed() {
        viewModel.data.observe(this) {
            val imageUrl = it.data
            Picasso.get().load(imageUrl).into(binding.imgBtnDog)
        }
    }

    private fun actions() {
        binding.searchViewDog.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(breedDog: String): Boolean {
                binding.searchViewDog.clearFocus()
                    viewModel.getImageDogBreed(breedDog)
                return false
            }

            override fun onQueryTextChange(breedDog: String?): Boolean {
                return false
            }
        })
    }

    private fun navigation() {
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}