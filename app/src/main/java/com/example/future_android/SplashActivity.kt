package com.example.future_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var handler = Handler()

        thread {
            for(i in 1..10) {
               Thread.sleep(1000)
            }
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}