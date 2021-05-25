package com.example.cardrecyclerk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      var recyclerView:  RecyclerView = findViewById(R.id.recyclerView)



        layoutManager = LinearLayoutManager (this)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerViewAdapter ()
        recyclerView.adapter = adapter



    }
}