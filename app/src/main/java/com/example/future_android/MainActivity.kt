package com.example.future_android

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myReciever = MyBroadCast()
        val myIntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
        registerReceiver(myReciever,myIntentFilter)
    }
}