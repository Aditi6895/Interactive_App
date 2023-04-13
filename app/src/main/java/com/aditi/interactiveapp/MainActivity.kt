package com.aditi.interactiveapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDark=findViewById<Button>(R.id.btnDark)
        val btnRead=findViewById<Button>(R.id.btnRead)
        val linearLayout=findViewById<LinearLayout>(R.id.linearLayout)

        btnDark.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.yellow)
        }
        btnRead.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.black)
        }
    }
}