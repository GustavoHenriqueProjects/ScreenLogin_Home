package com.example.interfacelogin.repository

import android.content.Context
import com.example.interfacelogin.dao.repository.TripDb
import com.example.interfacelogin.model.User

class UserRepository(context: Context) {

    //Variavel que representa nosso banco de dados
    private val db = TripDb.getDataBase(context)

    fun save(user: User): Long{
        return  db.userDao().save(user)
    }
}