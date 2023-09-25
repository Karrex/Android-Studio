package com.example.ushuaia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.loginbutton)
        val tvGoToRegister = findViewById<TextView>(R.id.tv_go_to_register)

        btnLogin.setOnClickListener {

            val intent = Intent(this, MenuTActivity ::class.java)
            startActivity(intent)
        }

        tvGoToRegister.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}


