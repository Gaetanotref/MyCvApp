package com.example.newapplicationmycv

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SuspiciousIndentation")
    fun clickFuncNextpage(view: View) {
    val intent = Intent(this,Second_Activity::class.java)
        startActivity(intent)
    }
}