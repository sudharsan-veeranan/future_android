package com.example.future_android

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by sudharsan at 3/15/2023
 */
class CardAdapter(var userDataList : List<UsersData>,var context : Context) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

//    val mContext = getContext

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        var rvViewCar = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return CardViewHolder(rvViewCar)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.setCardViewHolder(userDataList[position], context)
    }

    override fun getItemCount(): Int {
        return userDataList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setCardViewHolder(users : UsersData, context:Context){
//            var cardImgView = itemView.findViewById<ImageView>(R.id.imgCardView)
            var cardNameTextView = itemView.findViewById<TextView>(R.id.tv_name)
            var cardEmailTextView = itemView.findViewById<TextView>(R.id.tv_email)

            cardNameTextView.text = users.name
            cardEmailTextView.text = users.email

            var parentLayout = itemView.findViewById<CardView>(R.id.card_main_layout)

            parentLayout.setOnClickListener {
                var intent  = Intent( context ,DetailsActivity::class.java)
                intent.putExtra("user_id",users.id)
                intent.putExtra("user_name",users.name)
                intent.putExtra("user_username",users.username)
                intent.putExtra("user_email",users.email)
                intent.putExtra("user_phone",users.phone)
                intent.putExtra("user_website",users.website) 
                context.startActivity(intent)
            }
        }
    }
}