package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityCode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        val btnLanjut2: Button = findViewById(R.id.btn_lanjut2)
        val emailTextView: TextView = findViewById(R.id.telahMengirimkode)

        val email = intent.getStringExtra("email") ?: ""

        emailTextView.text = "Telah mengirim token ke ${email.substring(0, 1)}*********${email.substring(email.indexOf('@'))}"

        btnLanjut2.setOnClickListener {
            val tokenEditText: EditText = findViewById(R.id.et_token)
            val token = tokenEditText.text.toString()

            if (token.isNotEmpty()) {
                // Redirect to MainActivity (ActivityLogin)
                val intent = Intent(this@ActivityCode, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Show warning if token is empty
                Toast.makeText(this@ActivityCode, "Token harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
