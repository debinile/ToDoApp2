package com.ajoritsedebi.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity2 : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button
    private lateinit var myActivity : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        usernameDisplay = findViewById(R.id.userNamedisplay)
        profileButton = findViewById(R.id.profileButton)
        myActivity = findViewById(R.id.myActivity)

        usernameDisplay.text = intent.getStringExtra("name")

        profileButton.setOnClickListener {
            openProfilePage()
        }
        myActivity.setOnClickListener {

        }
    }

    private fun openProfilePage() {
        val myIntent = Intent(this, ProfileActivity::class.java)
        startActivity(myIntent)
    }
    private fun openmyActivity (){
        val meIntent = Intent ( this, myActivity :: class.java)
        startActivity(meIntent)
    }
}