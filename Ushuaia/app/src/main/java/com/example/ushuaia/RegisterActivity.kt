package com.example.ushuaia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton = findViewById<Button>(R.id.registerButton)
        val goToLoginText = findViewById<TextView>(R.id.tv_go_to_login)

        registerButton.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }

        goToLoginText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

