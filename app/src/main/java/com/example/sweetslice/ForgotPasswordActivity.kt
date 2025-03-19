package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val btnSendReset = findViewById<Button>(R.id.btnSendReset)
        val tvReturnLogin = findViewById<TextView>(R.id.tvReturnLogin)

        btnSendReset.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Link send Successfully!!", Toast.LENGTH_SHORT).show()
            finish()
        }

        tvReturnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
