package com.example.interfacelogin.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.interfacelogin.R
import com.example.interfacelogin.model.CardCategories

class ListCategories {
    companion object {

        @Composable
        fun getListCategories(): List<CardCategories> {
            return listOf<CardCategories>(
                CardCategories(
                    id = 0,
                    cardtitle = "Montain",
                    image = painterResource(id = R.drawable.montain)
                ),
                CardCategories(
                    id = 1,
                    cardtitle = "Snow",
                    image = painterResource(id = R.drawable.snow)
                ),
                CardCategories(
                    id = 2,
                    cardtitle = "Beach",
                    image = painterResource(id = R.drawable.beach)
                )
            )
        }
    }
}