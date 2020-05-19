package com.example.newpizza.date

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ToppingDao{
    @Insert
    fun insert(topping: Topping)
    @Query ("select * from topping")
    fun getAll():List<Topping>
}
/*原始資料內容
@Dao
interface ToppingDao {

    @Query("select * from topping")
    fun getAll(): List<Topping>

    @Query("select * from topping where id = :id")
    fun getToppingById(id: Int): Topping

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(topping: Topping)
}
 */