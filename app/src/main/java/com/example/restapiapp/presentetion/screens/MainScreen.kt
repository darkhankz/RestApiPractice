package com.example.restapiapp.presentetion.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.restapiapp.presentetion.ui.theme.RestApiAppTheme

@Composable
fun MainScreen() {
    Column() {
        Text(text = "test this screen")
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    RestApiAppTheme {
        MainScreen()
    }
}