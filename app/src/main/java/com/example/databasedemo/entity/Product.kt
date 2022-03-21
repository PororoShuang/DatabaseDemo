package com.example.databasedemo.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ProductTable")

data class Product(
    @PrimaryKey(autoGenerate=true) //auto increase by 1 everytime generate
    var id : Int =0,

    @ColumnInfo(name = "description")
    var description : String="",

    @ColumnInfo(name = "price")
    var price : Double =0.00

)
