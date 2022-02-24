package com.example.lap01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_1a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1a)

        //sk nút login
        val btnLogin1a = findViewById<Button>(R.id.btnLogin1)
        btnLogin1a.setOnClickListener {
            val intent = Intent(this, MainActivity_1d::class.java)
            startActivity(intent)
        }

        //sk nút sign up
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            val intent = Intent(this, MainActivity_1e::class.java)
            startActivity(intent)
        }
    }
}