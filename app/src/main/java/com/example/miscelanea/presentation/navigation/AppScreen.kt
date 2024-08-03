package com.example.miscelanea.presentation.navigation

sealed class AppScreen(val route:String) {
    object MyEstadoUnoScreen:AppScreen("Estado Uno")
    object  MyestadoDosScreen:AppScreen("Estado Dos")
}