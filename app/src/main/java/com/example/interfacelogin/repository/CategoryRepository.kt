package com.example.interfacelogin.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.interfacelogin.R
import com.example.interfacelogin.model.Category

//Essa Classe faz uso dos atributos da classe Category para criar uma lista
class CategoryRepository {
    companion object {
        //Funcao que retorna uma lista de categorias dos cards de viagem
        @Composable
        fun getCategories(): List<Category> {
            return listOf(
                Category(
                    id = 1,
                    categoryName = "Montain",
                    categoryIcon = painterResource(id = R.drawable.montain)
                ),
                Category(
                    id = 2,
                    categoryName = "Snow",
                    categoryIcon = painterResource(id = R.drawable.snow)
                ),
                Category(
                    id = 3,
                    categoryName = "Beach",
                    categoryIcon = painterResource(id = R.drawable.beach)
                )
            )
        }
    }
}