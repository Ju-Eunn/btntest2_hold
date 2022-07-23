package com.example.btntest2_hold

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 : ImageButton = findViewById<ImageButton>(R.id.btn1)
        btn1.setOnClickListener {
            btn1.isSelected = btn1.isSelected != true
        }
    }
}