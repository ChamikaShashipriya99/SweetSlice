package com.example.sweetslice

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.splash_sweetslice
        val uri = videoPath.toUri()

        videoView.setVideoURI(uri)
        videoView.setOnCompletionListener {
            // After the video finishes, move to the next screen
            startActivity(Intent(this, OnboardingActivity::class.java))
            finish()
        }

        videoView.start()
    }
}
