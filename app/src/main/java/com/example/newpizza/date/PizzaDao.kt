package com.example.newpizza.date

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PizzaDao{
    @Insert
    fun insert(pizza: Pizza)

    @Query("select * from pizza")
    fun getAll():List<Pizza>
}

/*原始資料
@Dao
interface PizzaDao {
    @Query("select * from pizza")
    fun getAll() : LiveData<List<Pizza>>

    @Query("select * from pizza where id = :id")
    fun getPizzaById(id: Int) : Pizza

    @Insert
    fun insert(pizza: Pizza): Long

    @Query("delete from pizza where id = :id")
    fun deletePizzaById(id: Int)
}
 */