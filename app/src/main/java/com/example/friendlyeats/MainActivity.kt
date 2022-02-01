package com.example.friendlyeats

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.friendlyeats.Models.Foods

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        initViews()

        refreshAdapter(prepareFoodList())
    }


    @SuppressLint("WrongConstant")
    private fun initViews() {
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
    }

    private fun refreshAdapter(food: ArrayList<Foods>) {
        val adapter = CustomAdapter(food)
        recyclerView.adapter = adapter

    }

    private fun prepareFoodList(): ArrayList<Foods> {
        val foods = ArrayList<Foods>()

        for (i in 0..50) {
            foods.add(Foods("BigBurger", "Burger", "With beef", R.drawable.food_image))
        }
        return foods
    }
}