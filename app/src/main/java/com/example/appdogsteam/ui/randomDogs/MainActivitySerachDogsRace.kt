package com.example.appdogsteam.ui.randomDogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appdogsteam.R
import com.example.appdogsteam.databinding.ActivityMainSerachDogsRaceBinding
import com.squareup.picasso.Picasso

class MainActivitySerachDogsRace : AppCompatActivity() {
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
        callRandomDogs()
        observerRandomDogs()
        actions()
        navigation()
    }
    private fun callRandomDogs() {
    }
    private fun observerRandomDogs() {
    }
    private fun actions(){

    }
    private fun navigation(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}