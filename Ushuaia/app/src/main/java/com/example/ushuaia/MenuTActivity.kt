package com.example.ushuaia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MenuTActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_tactivity)

        val pedidoButton = findViewById<Button>(R.id.pedidoButton)
        val volverButton = findViewById<TextView>(R.id.volverButton)

        pedidoButton.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }

        volverButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


