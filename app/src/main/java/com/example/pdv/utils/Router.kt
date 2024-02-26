package com.example.pdv.utils

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pdv.screens.HomeScreen
import com.example.pdv.screens.ProductScreen

@Composable
fun Router () {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("product") { ProductScreen(navController) }

    }
}