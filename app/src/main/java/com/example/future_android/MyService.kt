package com.example.future_android

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    var TAG = javaClass.simpleName
    lateinit var mediaPlayer : MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this,R.raw.cantinaband3)
        Log.d(TAG, "onCreate: service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: service is started")
        mediaPlayer.start()
        mediaPlayer.isLooping = true // To set the music to be on loop
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ${mediaPlayer.isPlaying}")
        Log.d(TAG, "onDestroy: service is destroyed")
        mediaPlayer.stop()
        super.onDestroy()
    }
}