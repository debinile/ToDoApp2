package com.ajoritsedebi.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity2 : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        usernameDisplay = findViewById(R.id.userNamedisplay)
        usernameDisplay.text = intent.getStringExtra("name")
    }
}