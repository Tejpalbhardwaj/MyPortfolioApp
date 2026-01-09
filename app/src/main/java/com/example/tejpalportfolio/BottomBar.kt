package com.example.tejpalportfolio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("home") },
            icon = { Icon(Icons.Default.Home, null) },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("projects") },
            icon = { Icon(Icons.Default.Star, null) },
            label = { Text("Projects") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("skills") },
            icon = { Icon(Icons.Default.Face, null) },
            label = { Text("Skills") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("contact") },
            icon = { Icon(Icons.Default.Call, contentDescription = null) },
            label = { Text(text = "Contact") }
        )
    }
}
