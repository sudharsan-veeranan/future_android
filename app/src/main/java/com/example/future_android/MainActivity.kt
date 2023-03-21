package com.example.future_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var usersList: ArrayList<Users>
    lateinit var carsList: ArrayList<Cars>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerViewMA = findViewById<RecyclerView>(R.id.recyclerViewMainActivity)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        recyclerViewMA.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        usersList = ArrayList<Users>()

        // set recycler view adapter
        /*    recyclerViewMA.adapter = MyAdapter(usersList)
        getData()*/

        // --------------------- Card View ----------------------

        carsList = ArrayList<Cars>()
        getCarsData()
        recyclerViewMA.adapter = CardAdapter(carsList)

    }

//    TODO("Replace the getData function with actual data or from the database")

    private fun getData() {
        for (i in 1..5) {
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

    private fun getCarsData() {
        for (i in 1..5) {
            carsList.add(Cars(R.drawable.maserati, "Maserati", "M189"))
            carsList.add(Cars(R.drawable.maserati, "Maserati", "M240"))
            carsList.add(Cars(R.drawable.maserati, "Maserati", "M188"))
            carsList.add(Cars(R.drawable.maserati, "Maserati", "M187"))
            carsList.add(Cars(R.drawable.maserati, "Maserati", "M186"))
            carsList.add(Cars(R.drawable.maserati, "Maserati", "M185"))
        }
    }
}