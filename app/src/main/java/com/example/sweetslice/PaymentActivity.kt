package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    private lateinit var buttonpay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        val buttonBack = findViewById<ImageView>(R.id.buttonBack)
        buttonpay = findViewById(R.id.buttonpay)

        // Back button click
        buttonBack.setOnClickListener {
            finish() // Go back to CakeDetailsActivity
        }

        // Pay Now button click
        buttonpay.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
        }
    }
}