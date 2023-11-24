package com.example.daechoong

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


var dataList2 = mutableListOf(
    YourData("아이스 커피"),
    YourData("아메리카노"),
    YourData("스타벅스")
)

class UpdateActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update) // Replace with the actual layout file name
        val recyclerView2: RecyclerView = findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = LinearLayoutManager(this)
        //val adding: Button = findViewById(R.id.button5)

        dataList.add(YourData("추가되었습니다"))
        val adapter = YourAdapter(dataList)
        recyclerView2.adapter = adapter

        // Sample data for testing

    }
}