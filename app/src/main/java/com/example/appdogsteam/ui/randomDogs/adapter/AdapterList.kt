package com.example.appdogsteam.ui.randomDogs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterList (private val list: List<String>, private val onClick: (String) -> Unit): RecyclerView.Adapter<ViewHolderList>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemperritos, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val images = listaPerritos[position]
        holder.image1.setImageResource(images[0])
        holder.image1.setImageResource(images[1])
        holder.image1.setImageResource(images[2])
    }

    override fun getItemCount(): Int {
        return listaPerritos.size
    }
}
inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){

    val image1: ImageView = view.findViewById(R.id.iv_image1)
    val image2: ImageView = view.findViewById(R.id.iv_image2)
    val image3: ImageView = view.findViewById(R.id.iv_image3)
}
