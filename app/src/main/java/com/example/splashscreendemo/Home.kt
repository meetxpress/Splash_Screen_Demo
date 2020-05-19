package com.example.splashscreendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnInsert.setOnClickListener {
            Toast.makeText(this@Home,"Insert Button", Toast.LENGTH_LONG).show()
        }
        btnDisplay.setOnClickListener {
            Toast.makeText(this@Home,"Display Button", Toast.LENGTH_LONG).show()
        }
        btnExit.setOnClickListener {
            finishAffinity()
            finish()
        }
    }
}
