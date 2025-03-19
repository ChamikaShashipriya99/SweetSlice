package com.example.sweetslice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CakeDetailsActivity : AppCompatActivity() {

    private var portionCount = 2
    private lateinit var textPortion: TextView
    private lateinit var textPrice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cake_details)

        // Initialize views
        textPortion = findViewById(R.id.textPortion)
        textPrice = findViewById(R.id.textPrice)
        val buttonIncrease = findViewById<ImageView>(R.id.buttonIncrease)
        val buttonDecrease = findViewById<ImageView>(R.id.buttonDecrease)
        val buttonOrderNow = findViewById<Button>(R.id.buttonOrderNow)
        val buttonBack = findViewById<ImageView>(R.id.buttonBack)

        // Back button click
        buttonBack.setOnClickListener {
            finish() // Go back to the previous activity
        }

        // Increase portion
        buttonIncrease.setOnClickListener {
            portionCount++
            updatePrice()
        }

        // Decrease portion
        buttonDecrease.setOnClickListener {
            if (portionCount > 1) {
                portionCount--
                updatePrice()
            }
        }

        // Order Now button click
        buttonOrderNow.setOnClickListener {
            // Handle order functionality (navigate or show a toast)
        }
    }

    private fun updatePrice() {
        textPortion.text = portionCount.toString()
        val totalPrice = portionCount * 1500 // Assuming price per portion is Rs. 1500
        textPrice.text = "Rs.$totalPrice/="
    }
}
