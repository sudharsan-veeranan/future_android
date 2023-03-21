package com.example.future_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

var TAG = "Retro"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nwCall = Retrofit.myRetrofit.getUsers()
        nwCall.enqueue( object : Callback<List<Users>>{
            override fun onResponse(call: Call<List<Users>>, response: Response<List<Users>>) {
                val usersList: List<Users> = response.body()!!
                for(user in usersList){
                    Log.d(TAG, "onResponse: name is ${user.name} and the email is ${user.email} ")
                }
            }

            override fun onFailure(call: Call<List<Users>>, t: Throwable) {
                Log.d(TAG, "the error is ${t}")
            }

        })
    }
}