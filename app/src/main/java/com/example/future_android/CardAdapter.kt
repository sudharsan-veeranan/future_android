package com.example.future_android

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by sudharsan at 3/15/2023
 */
class CardAdapter {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setCardViewHolder(cars: Cars){
            var carImgView = itemView.findViewById<ImageView>(R.id.carImgViewCardView)
            var carBrandTV = itemView.findViewById<TextView>(R.id.cardBrandTV)
            var carVehLineTV = itemView.findViewById<TextView>(R.id.carVehLineTV)

            carImgView.setImageDrawable(cars.carImg)
            carBrandTV.setText(cars.brandName)
            carVehLineTV.setText(cars.vehicleLine)
        }
    }
}