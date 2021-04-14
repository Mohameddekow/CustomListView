 package com.example.customlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class MyListAdapter(var contx: Context, var resouce: Int, var items: List<Hero>)
    : ArrayAdapter<Hero>(contx, resouce, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(contx)

        var view:View = layoutInflater.inflate(resouce, null)

        var image:ImageView = view.image
        var text:TextView = view.imageText
        var price:TextView = view.price

        var hero: Hero = items[position]

        image.setImageDrawable(contx.resources.getDrawable(hero.image))
        text.text = hero.name
        price.text = hero.price

        return view
    }
}