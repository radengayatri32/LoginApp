package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityActivation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activation)

        val btnLanjut: Button = findViewById(R.id.lanjut_2)

        btnLanjut.setOnClickListener {
            val emailEditText: EditText = findViewById(R.id.et_email)
            val email = emailEditText.text.toString()

            if (email.isNotEmpty()) {
                // Redirect to ActivityCode
                val intent = Intent(this@ActivityActivation, ActivityCode::class.java)
                intent.putExtra("email", email)  // Pass email to ActivityCode
                startActivity(intent)
            } else {
                // Show warning if email is empty
                Toast.makeText(this@ActivityActivation, "Email harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
