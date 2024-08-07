package com.example.miscelanea.presentation.screens.myestadodosscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MyEstadoDosScreen(navController : NavHostController){
    var contador by rememberSaveable{
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sumar")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Restar")
        }
        Text(text = "El Contador es = $contador")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyestadoDosScreenPreview(){
    MyEstadoDosScreen(rememberNavController())
}