package com.example.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//The things we'll be using here will be imported 1st and then used.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadbtn = findViewById<Button>(R.id.upload_btn)
        val downloadbtn = findViewById<Button>(R.id.download_btn)
        val act_btn = findViewById<Button>(R.id.act_btn)
        //val layout = findViewById<LinearLayout>(R.id.main)

        uploadbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading...", Toast.LENGTH_SHORT).show()
        }

        downloadbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading...", Toast.LENGTH_SHORT).show()
        }

        intent = Intent(applicationContext, Activity_two::class.java)
        act_btn.setOnClickListener {
            startActivity(intent)
        }

    }
}