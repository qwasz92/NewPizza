package com.example.newpizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pizza_row.view.*

class MainActivity : AppCompatActivity() {
    val functions = listOf<String>("Test1","Test2","Test3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //RecycleLerView
        pizzaRecyclerView.layoutManager = LinearLayoutManager(this)
        pizzaRecyclerView.setHasFixedSize(true)
        pizzaRecyclerView.adapter = FunctionsAdapter()
    }
    inner class FunctionsAdapter():RecyclerView.Adapter<FunctionHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunctionHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.pizza_row,parent,false)
            val holder = FunctionHolder(view)
            return holder
        }

        override fun getItemCount(): Int {
        return functions.size
        }

        override fun onBindViewHolder(holder: FunctionHolder, position: Int) {
            holder.nameText.text = functions.get(position)
        }

    }
    class FunctionHolder(view:View): RecyclerView.ViewHolder(view){
        var nameText:TextView = view.textView
    }
}
