package com.example.dogglersez;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglersez.adapter.DogCardAdapter
import com.example.dogglersez.consts.Layout
import com.example.dogglersez.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        binding.horizontalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
