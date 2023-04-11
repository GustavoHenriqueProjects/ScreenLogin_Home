package com.example.interfacelogin.repository

import android.content.Context
import com.example.interfacelogin.dao.repository.TripDb
import com.example.interfacelogin.model.User

class UserRepository(context: Context) {

    //Segunda etapa cria as funcoes que passsaram as informacoes da gui para a classe UserDao
    //Fazer a persistencia

    //Variavel que representa nosso banco de dados
    private val db = TripDb.getDataBase(context)

    //Responsavel por inserir um novo usuario no banco
    fun save(user: User): Long{
        return  db.userDao().save(user)
    }

    //Responsavel por encontra o usuario no banco
    fun findUserByEmail(email: String): User{
        return db.userDao().findUserByEmail(email)
    }

    //Função responsavel pela identificacao do usuario
    fun authenticate(email: String, password: String): User{
        return db.userDao().authenticate(email, password)
    }

}