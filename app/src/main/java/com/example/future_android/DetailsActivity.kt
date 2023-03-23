package com.example.future_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val TAG = "DetailsActivity"

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var userId = intent.getStringExtra("user_id")
        var userName = intent.getStringExtra("user_name")
        var userUsername = intent.getStringExtra("user_username")
        var userEmail = intent.getStringExtra("user_email")
        var userPhone = intent.getStringExtra("user_phone")
        var userWebsite = intent.getStringExtra("user_website")

        var idTv = findViewById<TextView>(R.id.tv_id_detail)
        idTv.text = "Id: "+userId

        var nameTv = findViewById<TextView>(R.id.tv_name_detail)
        nameTv.text = "Name: "+userName

        var usernameTv = findViewById<TextView>(R.id.tv_username_detail)
        usernameTv.text = "Username: "+userUsername

        var phoneTv = findViewById<TextView>(R.id.tv_phone_detail)
        phoneTv.text = "Phone: "+userPhone

        var emailTv = findViewById<TextView>(R.id.tv_email_detail)
        emailTv.text = "Email: "+userEmail

        var websiteTv = findViewById<TextView>(R.id.tv_website_detail)
        websiteTv.text = "Website: "+userWebsite

    }
}