package com.example.variasactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasactivities.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bNextActivity.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("NUM_ALEATORIO",Random.nextInt())
            startActivity(intent)
        }
    }
}