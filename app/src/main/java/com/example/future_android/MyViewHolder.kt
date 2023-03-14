package com.example.future_android

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by sudharsan at 3/14/2023
 */
class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

    fun setViewTextHolder(users:Users){
        var loginTV = itemView.findViewById<TextView>(R.id.loginTextView)
        var passwordTV = itemView.findViewById<TextView>(R.id.passwordTextView)

        loginTV.setText(users.username)
        passwordTV.setText(users.password)
    }
}