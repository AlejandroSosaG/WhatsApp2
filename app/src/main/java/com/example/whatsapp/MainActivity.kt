package com.example.whatsapp

// ? Imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whatsapp.ui.theme.WhatsAppTheme

/**
 * MainActivity class, where the navController is created and the application routes are defined.
 * Toasts and the database's viewModel are also instantiated here.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppTheme { // Aply the theme, but it doesn't work correctly
                // Create the navController
                val navController = rememberNavController()
                val context = LocalContext.current
                val modifier = Modifier
                // Define the routes
                NavHost(
                    navController = navController,
                    startDestination = "Login" // First screen
                ) {
                    composable(route = "Login") { // List of Contacts screen
                        Login(
                            navController, context, modifier)
                    }
                    composable(route = "Entrada") { // Create Contact screen
                        Entrada(
                            navController,
                            modifier
                        )
                    }
                }
            }
        }
    }
}
