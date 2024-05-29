package com.example.appdogsteam.ui.randomDogs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.appdogsteam.R
import com.squareup.picasso.Picasso

class AdapterList (private val list: List<String>, private val onClick: (String) -> Unit): RecyclerView.Adapter<ViewHolderList>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemdogs, parent, false)
        return ViewHolderList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        holder.render(list[position], onClick)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
 class ViewHolderList(view: View): RecyclerView.ViewHolder(view){

     private val binding = ItemListBinding.bind(View)

   fun render(item: String, onClick: (String) -> Unit){
       Picasso.get().load(item).into(binding.ivImage)
       binding.ivImage.setOnClickListener {
           onClick(item)
       }
   }
}
