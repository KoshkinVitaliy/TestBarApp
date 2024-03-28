package com.example.testbarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.testbarapp.bottom_navigation.MainScreen
import com.example.testbarapp.ui.theme.TestBarAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestBarAppTheme {
                MainScreen()
            }
        }
    }
}
