package com.example.newapplicationmycv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.button2)
        //CHANGE ACTIVITY ( FIRST -> SECOND)
        button2.setOnClickListener {
            val intent = Intent(this,Second_Activity::class.java)
            startActivity(intent)
        }
    }

}