package com.example.appdogsteam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appdogsteam.databinding.ActivityMainBinding
import com.example.appdogsteam.ui.randomDogs.MainActivityDogsRandom
import com.example.appdogsteam.ui.randomDogs.MainActivitySerachDogsRace

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        navigation()
    }
    private fun navigation() {
        binding.btnRandomDogs.setOnClickListener {
            startActivity(Intent(this, MainActivityDogsRandom::class.java))
        }
        binding.btnSearchDogsRace.setOnClickListener {
            startActivity(Intent(this, MainActivitySerachDogsRace::class.java))
        }
    }
}