package com.example.ej7.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ej7.screens.AuthScreen
import com.example.ej7.screens.HomeScreen
import com.example.ej7.screens.RegisterScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.AuthScreen.route){
        composable(route = AppScreens.AuthScreen.route){
            AuthScreen(navController)
        }
        composable(route = AppScreens.RegisterScreen.route){
            RegisterScreen(navController)
        }
        composable(route = AppScreens.HomeScreen.route){
            HomeScreen(navController)
        }
    }
}