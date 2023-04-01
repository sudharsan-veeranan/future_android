package com.example.future_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.future_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainActivityLayout = ActivityMainBinding.inflate(layoutInflater)

        //--------------------- Services -------------------

        val startBtn = findViewById<Button>(R.id.startButton)
        val stopBtn = findViewById<Button>(R.id.stopButton)

        var myIntent = Intent(this,MyService::class.java)

        startBtn.setOnClickListener {
            startService(myIntent)
        }

        stopBtn.setOnClickListener {
            stopService(myIntent)
        }

    }
}