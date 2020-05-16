package com.example.newpizza

import android.app.Application
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.Room
import com.example.newpizza.date.PizzaDatabase
import com.example.newpizza.date.Topping
import kotlin.concurrent.thread

val toppingBitmaps = mutableMapOf<Topping,Bitmap>()
val toppings = mutableListOf<Topping>(
    Topping(1,"Pepperont","topping_pepperoni"),
    Topping(2,"Sausage","topping_sausage"),
    Topping(3,"Green Peppers","topping_green_peppers"),
    Topping(4,"Onions","topping_onions"),
    Topping(5,"Mushrooms","topping_mushrooms"),
    Topping(6,"Jalapenos","topping_jalepeno"),
    Topping(7,"Pineapple","topping_pineapple"),
    Topping(8,"Spinach","topping_spinach")
)
    lateinit var db:PizzaDatabase

class App :Application(){
   override fun onCreate(){
       db = Room.databaseBuilder(applicationContext,PizzaDatabase::class.java,"PizzaDatabase").build()
   thread {
       toppings.forEach { toppingBitmaps[it] = getBitmap(it.drawableName)
       db.toppingDao().insert(it)} }
       super.onCreate()
   }
   private fun getBitmap(drawableName:String):Bitmap{
        val resId = resources.getIdentifier(drawableName,"drawable",packageName)
        return BitmapFactory.decodeResource(resources,resId)
    }
}