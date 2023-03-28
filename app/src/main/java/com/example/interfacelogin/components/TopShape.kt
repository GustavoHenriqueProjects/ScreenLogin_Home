package com.example.interfacelogin.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopShape() {
    Column(
        modifier = Modifier
            .width(150.dp)
            .height(50.dp)
            .background(
                color = Color(207, 6, 240),
                shape = RoundedCornerShape(bottomStart = 20.dp)
            )
    ) {
    }
}

@Preview
@Composable
fun TopFormPreview(){
    TopShape()
}