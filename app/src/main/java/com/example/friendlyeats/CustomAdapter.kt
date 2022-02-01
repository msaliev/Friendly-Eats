package com.example.friendlyeats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.friendlyeats.Models.Foods

class CustomAdapter(val foods: ArrayList<Foods>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.tv_name)
        val foodName = view.findViewById<TextView>(R.id.food_name)
        val discription = view.findViewById<TextView>(R.id.description)
        val image = view.findViewById<ImageView>(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_custom, parent, false)

        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val food = foods.get(position)
        if (holder is CustomViewHolder) {
            holder.name.text = food.name
            holder.foodName.text = food.foodName
            holder.discription.text = food.description
            holder.image.setImageResource(food.image)
        }
    }

    override fun getItemCount(): Int {
        return foods.size
    }
}