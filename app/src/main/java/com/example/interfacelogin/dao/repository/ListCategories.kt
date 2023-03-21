package com.example.interfacelogin.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.interfacelogin.R
import com.example.interfacelogin.model.CardCategories

class ListCategories {
    companion object {

        @Composable
        fun getListCategories(): List<CardCategories> {
            return listOf<CardCategories>(
                CardCategories(
                    id = 0,
                    cardtitle = stringResource(id = R.string.mytrips_title_montain),
                    image = painterResource(id = R.drawable.montain)
                ),
                CardCategories(
                    id = 1,
                    cardtitle = stringResource(id = R.string.mytrips_title_snow),
                    image = painterResource(id = R.drawable.snow)
                ),
                CardCategories(
                    id = 2,
                    cardtitle = stringResource(id = R.string.mytrips_title_beach),
                    image = painterResource(id = R.drawable.beach)
                )
            )
        }

        @Composable
        fun getListTrips(): List<CardCategories> {
            return listOf<CardCategories>(
                CardCategories(
                    id = 0,
                    image = painterResource(id = R.drawable.trip_london),
                    localTrip = stringResource(id = R.string.mytrips_post_trips_subtitle_London),
                    year = 2019,
                    text = stringResource(id = R.string.mytrips_text_london)
                ),
                CardCategories(
                    id = 1,
                    image = painterResource(id = R.drawable.trip_porto),
                    localTrip = stringResource(id = R.string.mytrips_post_trips_subtitle_Porto),
                    year = 2022,
                    text = stringResource(id = R.string.mytrips_text_Porto)
                )
            )
        }
    }
}