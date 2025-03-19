package com.example.sweetslice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CakeAdapter(private val cakeList: List<Cake>, private val onCakeClick: (Cake) -> Unit) : RecyclerView.Adapter<CakeAdapter.CakeViewHolder>() {

    class CakeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cakeImage: ImageView = view.findViewById(R.id.imageViewCake)
        val cakeName: TextView = view.findViewById(R.id.textViewCakeName)
        val cakeRating: TextView = view.findViewById(R.id.textViewRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CakeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cake, parent, false)
        return CakeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CakeViewHolder, position: Int) {
        val cake = cakeList[position]
        holder.cakeImage.setImageResource(cake.imageResId)
        holder.cakeName.text = cake.name
        holder.cakeRating.text = "${cake.rating}"

        holder.itemView.setOnClickListener {
            onCakeClick(cake)
        }
    }

    override fun getItemCount() = cakeList.size
}