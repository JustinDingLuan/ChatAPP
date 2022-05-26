package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var buttonSignUp: Button
    class Login : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)

            editEmail = findViewById(R.id.edit_Email)
            editPassword = findViewById(R.id.edit_Password)
            buttonLogin = findViewById(R.id.buttonlogin)
            buttonSignUp = findViewById(R.id.buttonsignup)

            buttonSignUp.setOnClickListener(){
                val intent = Intent(this,SignUp::class.java)
                startActivity(intent)
            }


        }
    }