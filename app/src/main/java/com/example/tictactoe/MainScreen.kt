package com.example.tictactoe

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(context: Context){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = "home_screen" ){
        composable("home_screen"){
          HomeScreen(context=context,navController=navController)
        }
        composable("player_screen"){
            PlayerScreen(context=context,navController=navController)
        }
    }


}