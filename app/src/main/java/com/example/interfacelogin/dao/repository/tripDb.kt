package com.example.interfacelogin.dao.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.interfacelogin.model.User

//Anotação para representar que essa classe representa o banco de dados
//A Class tridb Herda RoomDataBase
@Database(entities = [User::class], version = 1)
 abstract class TripDb: RoomDatabase(){

    abstract fun userDao(): UserDao
    //getData base devolve a instancia do TripDb
    //companin object representa uma instancia unica
    companion object{
        //Lateinit a variavel é criada no final
        private lateinit var instanceDb: TripDb
        fun getDataBase(content: Context): TripDb{

            //Se nao esta inicializado instancio a classe
            if(!::instanceDb.isInitialized){
                instanceDb = Room
                    .databaseBuilder(
                        content,
                        TripDb::class.java,
                        "db_trip").allowMainThreadQueries().build()
            }
            return  instanceDb
        }
    }
}