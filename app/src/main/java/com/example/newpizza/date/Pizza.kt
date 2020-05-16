package com.example.newpizza.date

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
//實體儲存位置
class Pizza{
    @PrimaryKey(autoGenerate = true)
//    主要建構值自動產生
    var id:Int?= null
    var name:String=""
}


/*原始資料型態
@Entity
data class Pizza (

    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val name: String,
    val creationDate: Date
)*/