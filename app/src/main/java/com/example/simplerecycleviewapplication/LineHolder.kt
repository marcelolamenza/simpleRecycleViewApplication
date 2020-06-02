package com.example.simplerecycleviewapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LineHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val secondText: TextView = itemView.findViewById(R.id.second_text)
}