package com.example.sweetslice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingAdapter(private val context: Context) :
    RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {

    private val images = intArrayOf(
        R.drawable.onboarding_image1, // Screen 1 Image
        R.drawable.onboarding_image2, // Screen 2 Image
        R.drawable.onboarding_image3  // Screen 3 Image
    )

    private val titles = arrayOf(
        "Welcome to Sweet Delights",
        "Custom Creations",
        "Ready to Order?"
    )

    private val descriptions = arrayOf(
        "Indulge in freshly baked goodness! Order delicious cakes, made with love, right at your fingertips.",
        "Design your perfect cake for any special occasion.",
        "Get your favorite treats delivered right to your door."
    )

    class OnboardingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_onboarding, parent, false)
        return OnboardingViewHolder(view)
    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
        holder.titleTextView.text = titles[position]
        holder.descriptionTextView.text = descriptions[position]
    }

    override fun getItemCount(): Int = images.size
}
