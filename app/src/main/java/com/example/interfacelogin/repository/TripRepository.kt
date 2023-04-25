package com.example.interfacelogin.repository

import com.example.interfacelogin.model.Trip
import java.time.LocalDate

class TripRepository {
    companion object{
        fun getTrips(): List<Trip>{
            return listOf(
                Trip(
                    id = 0,
                    location = "London",
                    description = "London is the capital and largest city of the United Kingdom, with a population of just under 9 million.",
                    startDate = LocalDate.of(2023,4,21),
                    endDate = LocalDate.of(2023,4,23)
                ),
                Trip(
                    id = 1,
                    location = "Porto",
                    description = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula`s major urban",
                    startDate = LocalDate.of(2023,4,21),
                    endDate = LocalDate.of(2023,4,23)
                )
            )
        }
    }
}