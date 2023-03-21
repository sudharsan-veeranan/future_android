package com.example.future_android


import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by sudharsan at 3/21/2023
 */

interface ApiInterface{
    @GET("users")  // Endpoint of the url
    fun getUsers(): Call<List<Users>>
}

// Create the Android Client
class Retrofit {
    companion object{
        var myRetrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }

}