package com.example.newpizza

import androidx.lifecycle.ViewModel
import com.example.newpizza.date.Topping

class CreatorViewModel :ViewModel(){
    var pizzaName = "New Pizza"
    val switchStates = mutableMapOf<Topping,Boolean>()
}