package com.example.customlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = mutableListOf<Hero>()

        list.add(Hero(R.drawable.download1, "ugali","$30"))
        list.add(Hero(R.drawable.download2, "lunch", "$20"))
        list.add(Hero(R.drawable.download3, "break fast","$80"))
        list.add(Hero(R.drawable.download4, "super","$11"))
        list.add(Hero(R.drawable.download5, "canjero","$77"))

        listView.adapter = MyListAdapter(this, R.layout.list_item, list)
    }
}