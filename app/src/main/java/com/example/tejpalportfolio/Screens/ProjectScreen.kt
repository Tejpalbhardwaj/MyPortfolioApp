package com.example.tejpalportfolio.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tejpalportfolio.Project
import com.example.tejpalportfolio.ProjectCard
import com.example.tejpalportfolio.R

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProjectsScreen() {

    val projects = listOf(
        Project(
            "Expense Tracker",
            "Manage daily expenses",
            "Compose, Room",
            "https://www.youtube.com/watch?v=sWOmlDvz_3U",
            imgRes = R.drawable.img
        ),
        Project(
            "Weather App",
            "Live weather updates",
            "Retrofit, MVVM",
            "https://mail.google.com/mail/u/0/#inbox",
            imgRes = R.drawable.img
        ),
        Project(
            "Recipe App",
            "Browse recipes",
            "Compose, API",
            "https://www.google.com/",
            imgRes = R.drawable.img
        ),
        Project(
            "Expense Tracker",
            "Manage daily expenses",
            "Compose, Room",
            "https://www.youtube.com/watch?v=sWOmlDvz_3U",
            imgRes = R.drawable.img
        ),
        Project(
            "Weather App",
            "Live weather updates",
            "Retrofit, MVVM",
            "https://mail.google.com/mail/u/0/#inbox",
            imgRes = R.drawable.img
        ),
        Project(
            "Recipe App",
            "Browse recipes",
            "Compose, API",
            "https://www.google.com/",
            imgRes = R.drawable.img
        ),
        Project(
            "Expense Tracker",
            "Manage daily expenses",
            "Compose, Room",
            "https://www.youtube.com/watch?v=sWOmlDvz_3U",
            imgRes = R.drawable.img
        ),
        Project(
            "Weather App",
            "Live weather updates",
            "Retrofit, MVVM",
            "https://mail.google.com/mail/u/0/#inbox",
            imgRes = R.drawable.img
        ),
        Project(
            "Recipe App",
            "Browse recipes",
            "Compose, API",
            "https://www.google.com/",
            imgRes = R.drawable.img
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF0B0F10),
                        Color(0xFF101C1E),
                        Color(0xFF162E2B)
                    )
                )
            )
    ) {
        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp) ,
            contentPadding = PaddingValues(
                top = 16.dp,
                bottom = 120.dp   // 👈 IMPORTANT (space for bottom bar)
            )
        ) {
            items(projects) { project ->
                ProjectCard(project = project)
            }
        }

    }
}