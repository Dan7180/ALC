package com.example.alc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val startActivity2 = findViewById<Button>(R.id.button1)
        startActivity2.setOnClickListener {
            startActivity(Intent(this@MainActivity, Activity2::class.java))
        }

        val startActivity3 = findViewById<Button>(R.id.button2)
        startActivity3.setOnClickListener {
            startActivity(Intent(this@MainActivity, Activity4::class.java))
        }
    }
}
