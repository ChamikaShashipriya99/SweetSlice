package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class UserProfileActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etAddress: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnSave: Button
    private lateinit var btnCancel: Button
    private lateinit var settingsIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        // Initialize UI components
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etAddress = findViewById(R.id.etAddress)
        etPassword = findViewById(R.id.etPassword)
        btnSave = findViewById(R.id.btnSave)
        btnCancel = findViewById(R.id.btnCancel)
        settingsIcon = findViewById(R.id.IC_Setting)

        // Save button click event
        btnSave.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val address = etAddress.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || address.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "All fields must be filled!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Profile Saved!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                finish() // Close UserProfileActivity
            }
        }

        // Back button click
        val buttonBack = findViewById<ImageView>(R.id.backbutton)
        buttonBack.setOnClickListener {
            finish() // Go back to the previous activity
        }

        // Cancel button click event (Navigate back to ProfileActivity)
        btnCancel.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Cancelled, No changes saved!", Toast.LENGTH_SHORT).show()
            finish()
        }

        // Settings icon click event
        settingsIcon.setOnClickListener {
            Toast.makeText(this, "Settings Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
