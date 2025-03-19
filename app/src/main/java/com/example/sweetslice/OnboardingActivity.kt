package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardingActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var skipButton: TextView
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        viewPager = findViewById(R.id.viewPager)
        skipButton = findViewById(R.id.skipButton)
        nextButton = findViewById(R.id.nextButton)

        val adapter = OnboardingAdapter(this)
        viewPager.adapter = adapter

        nextButton.setOnClickListener {
            if (viewPager.currentItem < adapter.itemCount - 1) {
                viewPager.currentItem += 1 // Move to the next screen
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }

        skipButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == adapter.itemCount - 1) {
                    nextButton.text = "Get Started      🎂"
                } else {
                    nextButton.text = "Next      ➡️"
                }
            }
        })
    }
}
