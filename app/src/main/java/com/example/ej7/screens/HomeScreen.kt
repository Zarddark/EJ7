package com.example.ej7.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ej7.R
import com.example.ej7.navigation.AppScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold {
        HomeScreenContent(navController)
    }
}

@Composable
fun HomeScreenContent(navController: NavController) {
    Column( modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Estas en Home")
        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.secundary_background_color)),
            border = BorderStroke(2.dp, colorResource(id = R.color.black))
        ) {
            Text(text = "Cerrar Sesion", color = colorResource(id = R.color.black))
        }
    }
}
