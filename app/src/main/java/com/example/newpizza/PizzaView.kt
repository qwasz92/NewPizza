package com.example.newpizza

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import com.example.newpizza.date.Topping

class PizzaView (context: Context,val topping: MutableMap<Topping,Boolean>):View(context){

    class Position (var x:Float,var y:Float)
    val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        val width =  canvas.width.toFloat()
        val height = canvas.height.toFloat()
        val centerX = width/2
        val centerY = height/2
        val smallerDimension = if (width>height) height else    width

        // Draw a big circle for the crust
        paint.color = 0xffdfa172.toInt()
        val pizzaRadius = smallerDimension/2
        canvas.drawCircle(centerX,centerY,pizzaRadius,paint)

        // Draw a smaller circle for the pizza
        paint.color = 0xffebbc85.toInt()
        val smallerPizzaRadius = pizzaRadius*.85f
        canvas.drawCircle(centerX,centerY,smallerPizzaRadius,paint)
        super.onDraw(canvas)
    }
}