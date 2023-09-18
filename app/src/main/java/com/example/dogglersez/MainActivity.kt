package com.example.dogglersez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglersez.adapter.DogCardAdapter
import com.example.dogglersez.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.recyclerView.adapter = DogCardAdapter(this, 1)
getString(R.string.age, 5)

    }
}