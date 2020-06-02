package com.example.simplerecycleviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: RecyclerAdapter
    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
        initListeners()
    }

    private fun initRecycler(){
        rv = findViewById(R.id.recycler_view)
        rv.apply {
            layoutManager = LinearLayoutManager(
                this@MainActivity,LinearLayoutManager.VERTICAL, false)
            myAdapter = RecyclerAdapter()
            adapter = myAdapter
        }
    }

    private fun initListeners(){
        btn_add.setOnClickListener {
            myAdapter.addNumber()
            myAdapter.notifyItemInserted(myAdapter.itemCount)
        }

        btn_remove.setOnClickListener {
            if((myAdapter.itemCount -1) >= 0) {
                myAdapter.removeNumber(myAdapter.itemCount-1)
            }
        }
    }

}
