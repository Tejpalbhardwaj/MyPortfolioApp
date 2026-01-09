package com.example.tejpalportfolio

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.*
import com.example.tejpalportfolio.Screens.Contact
import com.example.tejpalportfolio.Screens.HomeScreen
import com.example.tejpalportfolio.Screens.ProjectsScreen
import com.example.tejpalportfolio.Screens.SkillsScreen


@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController)}
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "home"
        ) {
            composable("home") { HomeScreen(navController) }
            composable("projects") { ProjectsScreen() }
            composable("skills") { SkillsScreen() }
            composable ("contact"){ Contact() }
        }
    }
}
