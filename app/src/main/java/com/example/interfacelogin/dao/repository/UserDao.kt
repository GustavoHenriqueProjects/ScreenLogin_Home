package com.example.interfacelogin.dao.repository

import androidx.room.*
import com.example.interfacelogin.model.User

@Dao
interface UserDao {

    //Primeira etapa cria as funcoes que farao a persistencia no banco
    //Segunda etapa userRepository

    @Insert fun save(user: User): Long

    @Update fun update(user: User): Int

    @Delete fun delete(user: User): Int

    //Selecione todas as tabelas onde o email seja igual ao email e a password igual a senha.
    @Query("SELECT * FROM tbl_user WHERE  email = :email AND password = :pass")
    fun authenticate(email: String, pass: String): User

    @Query("SELECT * FROM tbl_user WHERE email = :email")
    fun findUserByEmail(email: String): User



}