package com.example.testbarapp.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Screen1() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(listOf(Color(0xFFFFFFFF),
                Color(0xFF7C7979)
            )))
        ,
        text = "Screen 1",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen2() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(listOf(Color(0xFFF8F532),
                Color(0xFFB4B225)
            ))),
        text = "Screen 2",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen3() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(listOf(Color(0xFF36F50F),
                Color(0xFF23940B)
            ))),
        text = "Screen 3",
        textAlign = TextAlign.Center,

    )
}

@Composable
fun Screen4() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(listOf(Color(0xFF1034E9),
                Color(0xFF051B46)
            ))),
        text = "Screen 4",
        textAlign = TextAlign.Center,
        color = Color.White
    )
}