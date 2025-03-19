package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val tvLogin = findViewById<TextView>(R.id.tvLogin)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Register Successfully!!", Toast.LENGTH_SHORT).show()
            finish()
        }

        tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
