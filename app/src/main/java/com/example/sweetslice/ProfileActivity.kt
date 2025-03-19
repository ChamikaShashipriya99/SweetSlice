package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val editProfileButton = findViewById<Button>(R.id.edit_profile)
        val logoutButton = findViewById<Button>(R.id.logout)
        val paymentHistory = findViewById<TextView>(R.id.payment_history)
        val orderHistory = findViewById<TextView>(R.id.order_history)
        val settingsButton = findViewById<ImageButton>(R.id.settings_button)

        // Navigate to UserProfileActivity
        editProfileButton.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            Toast.makeText(this, "You enter the Edit profile Section", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        // Navigate to LoginActivity and clear back stack
        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            Toast.makeText(this, "You Log Out. Have a Nice Day!!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        // TODO: Add navigation logic for Payment History
        paymentHistory.setOnClickListener {
            // Navigate to Payment History Screen
        }

        // TODO: Add navigation logic for Order History
        orderHistory.setOnClickListener {
            // Navigate to Order History Screen
        }

        // TODO: Add logic to open Settings screen
        settingsButton.setOnClickListener {
            // Open Settings
        }
    }
}
