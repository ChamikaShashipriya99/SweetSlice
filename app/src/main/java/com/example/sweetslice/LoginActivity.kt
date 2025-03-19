package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.loginButton)
        val signUpText: TextView = findViewById(R.id.signUpText)

        loginButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Login Successfully!!", Toast.LENGTH_SHORT).show()
            finish()
        }

        val tvSignUp = findViewById<TextView>(R.id.signUpText)
        tvSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val tvForgotPassword = findViewById<TextView>(R.id.forgotPassword)
        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }


    }
}