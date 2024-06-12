package com.example.ej7.navigation

sealed class AppScreens(val route: String){
    object RegisterScreen: AppScreens("register_screen")
    object AuthScreen: AppScreens("auth_screen")
    object HomeScreen: AppScreens("home_screen")
}
