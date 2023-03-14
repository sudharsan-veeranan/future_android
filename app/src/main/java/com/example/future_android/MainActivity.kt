package com.example.future_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var usersList: ArrayList<Users>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerViewMA = findViewById<RecyclerView>(R.id.recyclerViewMainActivity)
        recyclerViewMA.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        usersList = ArrayList<Users>()
        recyclerViewMA.adapter = MyAdapter(usersList)
        getData()
    }

//    TODO("Replace the getData function with actual data or from the database")

    private fun getData() {
        for(i in 1..5) {
            var user1 = Users("Ansari", "Pass123")
            usersList.add(user1)
            var user2 = Users("Ravi", "Pass123")
            usersList.add(user2)
            var user3 = Users("Suresh", "Pass123")
            usersList.add(user3)
            var user14 = Users("Pankaj", "Pass123")
            usersList.add(user14)
            var user15 = Users("Rahil", "Pass123")
            usersList.add(user15)
            var user17 = Users("Shail", "Pass123")
            usersList.add(user17)
            var user11 = Users("Venu", "Pass123")
            usersList.add(user11)
            var user19 = Users("Ansari", "Pass123")
            usersList.add(user19)
            usersList.add(Users("Sudharsan", "Sudhar112345"))
        }
    }
}