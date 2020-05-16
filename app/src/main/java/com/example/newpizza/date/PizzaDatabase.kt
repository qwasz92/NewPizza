package com.example.newpizza.date

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Pizza::class,Topping::class],version=1)
//標示Database裡面必須要有兩個東西，一個是entities(裡面要標示類別的物體)第二個是version的語法
abstract class PizzaDatabase: RoomDatabase() {
//    抽象類別的class繼承了RoomDatabase()
    abstract fun pizzaDao() :PizzaDao
//    抽象方法pizzaDao 繼承了PizzaDao
    abstract fun toppingDao():ToppingDao
//    抽象方法toppingDao繼承了ToppingDao
}

/*原始資料
@Database(entities = [Pizza::class, PizzaTopping::class, Topping::class], version = 2)
@TypeConverters(DateConverter::class)
abstract class PizzaDatabase: RoomDatabase() {
    abstract fun pizzaDao() : PizzaDao
    abstract fun pizzaToppingDao() : PizzaToppingDao
    abstract fun toppingDao() : ToppingDao
}
 */