package com.example.future_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by sudharsan at 3/15/2023
 */
class CardAdapter(var userDataList : List<UsersData>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        var rvViewCar = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return CardViewHolder(rvViewCar)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.setCardViewHolder(userDataList[position])
    }

    override fun getItemCount(): Int {
        return userDataList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setCardViewHolder(users : UsersData){
//            var cardImgView = itemView.findViewById<ImageView>(R.id.imgCardView)
            var cardNameTextView = itemView.findViewById<TextView>(R.id.tv_name)
            var cardEmailTextView = itemView.findViewById<TextView>(R.id.tv_email)

            cardNameTextView.text = users.name
            cardEmailTextView.text = users.email
        }
    }
}