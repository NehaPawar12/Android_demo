package com.example.example

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val web = findViewById<CardView>(R.id.cardweb)
        val cam = findViewById<CardView>(R.id.cardcam)

        web.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/neha-pawar-np1223/"))
            startActivity(intent)
        }

        cam.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        val btnfour = findViewById<Button>(R.id.button4)
        btnfour.setOnClickListener {
            val intent = Intent(applicationContext, Activity_four::class.java)
            startActivity(intent)
        }
    }
}