package com.example.recycleview_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persons = mutableListOf<Person>(
        Person("David",44),
        Person("Susan",43),
        Person("Lois",25),
        Person("Laura",32),
        Person("Per",65)


    // List with name that can be scrolled



    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PersonRecycleAdapter(this, persons)

        recyclerView.adapter = adapter



    }
}