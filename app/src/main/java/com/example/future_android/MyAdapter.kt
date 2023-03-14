package com.example.future_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by sudharsan at 3/14/2023
 */
class MyAdapter(var userList : ArrayList<Users>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var rvView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout,parent,false)
        return MyViewHolder(rvView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setViewTextHolder(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }


}