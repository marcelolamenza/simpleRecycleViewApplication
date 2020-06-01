package com.example.simplerecycleviewapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class recyclerAdapter : RecyclerView.Adapter<LineHolder>(){

    private var items = mutableListOf<viewData>()
    private var number = 0
    private var s = "Number: "

    fun updateList(user: viewData){
        insertItem(user)
    }

    private fun insertItem(user: viewData) {
        items.add(user)
        notifyItemChanged(itemCount)
    }

    fun removeItem(position: Int){
        items.removeAt(position)
        notifyItemRemoved(position)
        notifyItemChanged(position)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineHolder {
        return LineHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_view_holder,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: LineHolder, position: Int) {
        holder.mainText.text = s
        holder.secondText.text = number.toString()
        number++
    }


}