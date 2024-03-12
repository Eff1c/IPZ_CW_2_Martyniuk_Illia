package com.example.ipz_cw_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.ipz_cw_2.ui.theme.IPZ_CW_2_Martyniuk_IlliaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { Navigation() }
        setContent {
            IPZ_CW_2_Martyniuk_IlliaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SignIn(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SignIn(modifier: Modifier = Modifier) {
    Column {
        TextField(value = "", onValueChange = {}, placeholder = { Text("Введіть email") })
        TextField(value = "", onValueChange = {}, placeholder = { Text("Введіть пароль") })
        Button(onClick = {}) { Text(text = "Ввійти") }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    IPZ_CW_2_Martyniuk_IlliaTheme {
        SignIn()
    }
}


@Composable
fun DetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {}
}

@Preview
@Composable
fun DetailScreenPreview(){
    IPZ_CW_2_Martyniuk_IlliaTheme {
        DetailScreen()
    }
}


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
//        composable(route = Screen.MainScreen.route) {
//            SignIn()
//        }
//        composable(route = Screen.DetailScreen.route) {
//            DetailScreen()
//        }
    }
}