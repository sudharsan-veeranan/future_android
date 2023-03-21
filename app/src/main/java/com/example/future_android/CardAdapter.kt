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
class CardAdapter(var carList : ArrayList<Cars>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        var rvViewCar = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return CardViewHolder(rvViewCar)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.setCardViewHolder(carList[position])
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setCardViewHolder(cars: Cars){
            var carImgView = itemView.findViewById<ImageView>(R.id.carImgViewCardView)
            var carBrandTV = itemView.findViewById<TextView>(R.id.cardBrandTV)
            var carVehLineTV = itemView.findViewById<TextView>(R.id.carVehLineTV)

            carImgView.setImageResource(cars.carImg)
            carBrandTV.setText(cars.brandName)
            carVehLineTV.setText(cars.vehicleLine)
        }
    }
}