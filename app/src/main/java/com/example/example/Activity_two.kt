package com.example.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_two)

        var cold = findViewById<Button>(R.id.cold)
        var hot = findViewById<Button>(R.id.hot)
        var layout_id = findViewById<LinearLayout>(R.id.main2)

        cold.setOnClickListener{
            layout_id.setBackgroundResource(R.color.blue)
            //hot.setBackgroundResource(R.color.blue)
        }

        hot.setOnClickListener{
            layout_id.setBackgroundResource(R.color.brown)
            //cold.setBackgroundResource(R.color.brown)
        }

        val card = findViewById<Button>(R.id.but_card)
        card.setOnClickListener{
           val intent = Intent(applicationContext, Activity_three::class.java)
            startActivity(intent)
        }

    }
}