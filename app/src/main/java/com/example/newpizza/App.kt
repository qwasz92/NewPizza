package com.example.newpizza

import android.graphics.Bitmap
import com.example.newpizza.date.Topping

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