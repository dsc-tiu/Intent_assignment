package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class WelcomeScreeen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screeen)

        val message:String? = intent.getStringExtra(name:"NAME")

        val showName: TextView = findViewById(R.id.textView)

        showName.text = "welcome $message"

        /* Toast.makeText(this,"Welcome $message",Toast.LENGTH_LONG).show() */

    }
}
