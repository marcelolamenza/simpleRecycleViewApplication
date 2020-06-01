package com.example.simplerecycleviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: recyclerAdapter
    lateinit var rv: RecyclerView

    val text = "numero: "
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
        initListeners()
    }

    private fun initRecycler(){
        rv = findViewById<RecyclerView>(R.id.recycler_view)
        rv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            myAdapter = recyclerAdapter()
            adapter = myAdapter
        }
    }

    private fun initListeners(){
        btn_add.setOnClickListener {
            val model = viewData(text,number.toString())
            myAdapter.updateList(model)
            number++
        }

        btn_remove.setOnClickListener {
            if((myAdapter.itemCount -1) >0){
                myAdapter.removeItem(myAdapter.itemCount-1)
            }
        }
    }

}
