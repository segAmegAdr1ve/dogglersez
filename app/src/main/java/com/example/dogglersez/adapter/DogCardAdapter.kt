package com.example.dogglersez.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglersez.R
import com.example.dogglersez.data.DataSource
import com.example.dogglersez.databinding.VerticalHorizontalListItemBinding
import com.example.dogglersez.model.Dog



class DogCardAdapter(
    val context: Context,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    private val dataSource = DataSource
    val a = context.getApplicationContext()

    class DogCardViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        private val binding = VerticalHorizontalListItemBinding.bind(view)

        fun bind(dog: Dog) = with(binding) {
            imageView.setImageResource(dog.imageResourceId)
            textName.text = dog.name
            textAge.text =  view.context.getString(R.string.age,dog.age)
            textHobbies.text = view.context.getString(R.string.hobbies,dog.hobbies)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.vertical_horizontal_list_item, parent, false)
        return DogCardViewHolder(view)
    }

    override fun getItemCount() = DataSource.dogs.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        holder.bind(dataSource.dogs[position])
    }

}