package com.example.future_android

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by sudharsan at 2/23/2023
 */
class MyBroadCast:BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {

        var isAirPlaneModeOn = intent.getBooleanExtra("state",false)
        if(isAirPlaneModeOn) {
            Toast.makeText(context, "Airplane mode is on", Toast.LENGTH_LONG).show()
        }
        else Toast.makeText(context, "Airplane mode is off", Toast.LENGTH_LONG).show()
    }
}