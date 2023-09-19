package com.example.dogglersez;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglersez.adapter.DogCardAdapter
import com.example.dogglersez.consts.Layout
import com.example.dogglersez.databinding.ActivityGridListBinding

public class GridListActivity : AppCompatActivity() {

    lateinit var binding: ActivityGridListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
