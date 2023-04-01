package com.example.future_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.future_android.databinding.ActivitySplashBinding
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var intent = Intent(this, SecondaryService::class.java)
        startService(intent)

        var splashActivity = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashActivity.root)

        var handler = Handler()

        thread {
            for(i in 1..10){
                Thread.sleep(1000)
                handler.post{
                    Toast.makeText(this,"$i", Toast.LENGTH_SHORT).show()
                    splashActivity.textViewSplash.setText(i.toString())
                }
            }
        }

        splashActivity.buttonSplash.setOnClickListener {
            var mainActIntent= Intent(this, SecondaryActivity::class.java)
            startActivity(mainActIntent)
        }


    }
}