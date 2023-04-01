package com.example.future_android

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer

import android.os.IBinder

class SecondaryService : Service() {
    val TAG = javaClass.simpleName
    lateinit var mediaPlayer : MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this,R.raw.cantinaband3)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mediaPlayer.start()
        mediaPlayer.isLooping = true
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        mediaPlayer.stop()
        super.onDestroy()
    }
}