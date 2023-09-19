package com.example.dogglersez;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglersez.adapter.DogCardAdapter
import com.example.dogglersez.consts.Layout
import com.example.dogglersez.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
