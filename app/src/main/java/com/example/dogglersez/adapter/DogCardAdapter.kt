package com.example.dogglersez.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglersez.R
import com.example.dogglersez.consts.Layout
import com.example.dogglersez.data.DataSource
import com.example.dogglersez.databinding.GridListItemBinding
import com.example.dogglersez.databinding.VerticalHorizontalListItemBinding
import com.example.dogglersez.model.Dog




class DogCardAdapter(
    private val context: Context,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    private val dataSource = DataSource

    inner class DogCardViewHolder   (private val view: View): RecyclerView.ViewHolder(view) {
        val bindingG = if (layout == Layout.GRID) {
            GridListItemBinding.bind(view)
        } else null
        val bindingVH = if (layout !== Layout.GRID) {
            VerticalHorizontalListItemBinding.bind(view)
        } else null

        fun bind(dog: Dog, dataBinding: GridListItemBinding) = with(dataBinding) {
            imageView.setImageResource(dog.imageResourceId)
            textName.text = dog.name
            textAge.text =  view.context.getString(R.string.age,dog.age)
            textHobbies.text = view.context.getString(R.string.hobbies,dog.hobbies)
        }

        fun bind(dog: Dog, dataBinding: VerticalHorizontalListItemBinding) = with(dataBinding) {
            imageView.setImageResource(dog.imageResourceId)
            textName.text = dog.name
            textAge.text =  view.context.getString(R.string.age,dog.age)
            textHobbies.text = view.context.getString(R.string.hobbies,dog.hobbies)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val kindOfLayout = if (layout == Layout.GRID) {
            R.layout.grid_list_item
        } else {
            R.layout.vertical_horizontal_list_item
        }
        val view = LayoutInflater.from(context)
                .inflate(kindOfLayout, parent, false)
        return DogCardViewHolder(view)
    }

    override fun getItemCount() = DataSource.dogs.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        if (layout == Layout.GRID) {
            holder.bind(dataSource.dogs[position], holder.bindingG!!)
        } else {
            holder.bind(dataSource.dogs[position], holder.bindingVH!!)
        }
    }

}