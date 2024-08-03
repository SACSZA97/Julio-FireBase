package com.example.miscelanea.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.miscelanea.presentation.screens.myestadounoscreen.MyEstadoUnoScreen
import com.example.miscelanea.presentation.screens.myestadodosscreen.MyEstadoDosScreen

@Composable
fun AppNavigation(navController : NavHostController){
    NavHost(
        navController = navController,
        startDestination = AppScreen.MyEstadoUnoScreen.route
    ) {
        composable(route = AppScreen.MyEstadoUnoScreen.route){
            MyEstadoUnoScreen(navController)
        }
        composable(route = AppScreen.MyestadoDosScreen.route){
            MyEstadoDosScreen(navController)
        }
    }
}