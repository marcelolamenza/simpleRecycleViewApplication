package com.example.simplerecycleviewapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.main_view_holder.view.*

class LineHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var mainText = itemView.main_text
    val secondText = itemView.second_text
}