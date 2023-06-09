package com.example.interfacelogin.dao.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.interfacelogin.model.User

//Anotação para representar que essa classe representa o banco de dados
//A Class tridb Herda RoomDataBase

//Toda vez que for midificado a aestrutura do bamco é nessesasrio mudar a version
@Database(entities = [User::class], version = 2)
 abstract class TripDb: RoomDatabase(){

    //Silgleton é para desempenho e instabilidade do banco dados, cria apenas uma instancia para inserir dados
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
                        "db_trip").allowMainThreadQueries().fallbackToDestructiveMigration().build()
            }
            return  instanceDb
        }
    }
}