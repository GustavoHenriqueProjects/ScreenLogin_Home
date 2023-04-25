package com.example.interfacelogin.model

import androidx.compose.ui.graphics.painter.Painter
import com.example.interfacelogin.R
import java.time.LocalDate

/**************************************************
 * Data Class representa os dados de algo que existe
 * na tablea do banco de dados.
 ***************************************************/
data class Trip(
    var id: Long = 0, // O Long permite mais informacoes que o Int
    var location: String = "",
    //var image: Painter? = null, // ? -> Significa que esse atrituto pode ser null
    var description: String = "",
    var startDate: LocalDate = LocalDate.of(2000,1,1),
    var endDate: LocalDate = LocalDate.of(2000,1,1),
    var image: Int = R.drawable.no_photography_24
)
