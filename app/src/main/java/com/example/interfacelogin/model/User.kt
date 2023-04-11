package com.example.interfacelogin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Lembra o room de usar a classe User no banco de dados
@Entity(tableName = "tbl_user")
data class User(
    // var pode ser alterado
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    @ColumnInfo(name = "user_name") var userName: String = "", //No banco de dados o nome da collumn será user_name
    var email: String = "",
    var password: String = "",
    var phone: String = "",
    @ColumnInfo(name = "is_over_18") var isOver18: Boolean = false
)
