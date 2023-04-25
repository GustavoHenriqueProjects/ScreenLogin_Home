package com.example.interfacelogin.model

import androidx.compose.ui.graphics.painter.Painter

//Classe feito pelo Professor para pegar as informacoes do banco
data class Category(
    var id: Long = 0,
    var categoryName: String,
    var categoryIcon: Painter // ou Drawable para nao ser funcao de composicao
)
