package com.example.newpizza.date

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Topping (
    @PrimaryKey
    val id:Int,
    val name:String,
    val drawableName:String
)
/*原資料內容
@Entity
data class Topping (

        @PrimaryKey
    val id: Int,
    val name: String,
    val drawableName: String
)
 */