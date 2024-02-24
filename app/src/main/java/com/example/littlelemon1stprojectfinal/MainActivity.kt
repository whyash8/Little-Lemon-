package com.example.littlelemon1stprojectfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon1stprojectfinal.ui.theme.LittleLemon1stProjectFinalTheme

class MainActivity : ComponentActivity() {
    val sharedPreferences by lazy {
        getSharedPreferences("Little Lemon", MODE_PRIVATE)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemon1stProjectFinalTheme {
                // A surface container using the 'background' color from the theme
              Surface (
                  modifier= Modifier.fillMaxSize(),
                  color = MaterialTheme.colors.background
              ){
                  val navController = rememberNavController()
                  NavigationComposable(context = applicationContext,navController = navController)
              }
            }
        }
    }
}

