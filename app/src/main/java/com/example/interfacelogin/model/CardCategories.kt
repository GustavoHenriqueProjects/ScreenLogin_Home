package com.example.interfacelogin.model

import androidx.compose.ui.graphics.painter.Painter

/**************************************************
 * Data Class representa os dados de algo que existe
 * na tablea do banco de dados.
 ***************************************************/
data class CardCategories(
    var id: Int = 0,
    var cardtitle: String = "",
    var image: Painter? = null // ? -> Significa que esse atrituto pode ser null
)
