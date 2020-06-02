package com.example.simplerecycleviewapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<LineHolder>() {

    private var numbers = mutableListOf<Int>()
    private var currentNumber = 0

    fun addNumber() {
        numbers.add(currentNumber)
        currentNumber++
        notifyItemInserted(numbers.size - 1)
    }

    fun removeNumber(position: Int) {
        numbers.removeAt(position)
        currentNumber--
        notifyItemRemoved(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineHolder {
        return LineHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.main_view_holder,parent,false))
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: LineHolder, position: Int) {
        val numberItem = numbers[position]
        holder.secondText.text = numberItem.toString()
    }


}