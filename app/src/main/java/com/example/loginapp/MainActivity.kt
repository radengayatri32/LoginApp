package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btn_login)
        val textViewActivation: TextView = findViewById(R.id.textViewActivation)

        btnLogin.setOnClickListener {
            val emailEditText: EditText = findViewById(R.id.et_email)
            val passwordEditText: EditText = findViewById(R.id.et_password)

            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Redirect to SuccessLoginActivity
                val intent = Intent(this@MainActivity, SuccessLoginActivity::class.java)
                startActivity(intent)
            } else {
                // Show warning if email or password is empty
                Toast.makeText(this@MainActivity, "Email dan password harus diisi", Toast.LENGTH_SHORT).show()
            }
        }

        textViewActivation.setOnClickListener {
            // Redirect to ActivityActivation
            val intent = Intent(this@MainActivity, ActivityActivation::class.java)
            startActivity(intent)
        }
    }
}