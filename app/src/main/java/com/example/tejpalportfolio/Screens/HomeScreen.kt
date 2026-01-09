package com.example.tejpalportfolio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tejpalportfolio.R

@Composable
fun HomeScreen(navController: NavController) {

    val Poppins = FontFamily(
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_light, FontWeight.Light)
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(40.dp))

            // Profile Image
            Card(
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(12.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tejpal),
                    contentDescription = "Profile Image",
                    modifier = Modifier.size(160.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Role text
            Text(
                text = "Android Developer",
                color = Color(0xFF3DDC84),
                fontSize = 16.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Light,
                style = MaterialTheme.typography.bodySmall,
                letterSpacing = 1.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Name
            Text(
                text = "Tejpal Bhardwaj",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontFamily = Poppins,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Description
            Text(
                text = "Android Developer passionate about clean architecture principles , Jetpack Compose and Scalable app development",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.LightGray,
                fontFamily = Poppins,

                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Works / Stats Card


            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 32.dp, vertical = 14.dp)
                ) {
                    Column() {
                        Text(
                            text = "🟢Open To Work",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium,
                            fontFamily = Poppins,
                            color = Color.White
                        )
                        Text(
                            text = "🟡Available for internships",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium,
                            fontFamily = Poppins,
                            color = Color.White
                        )
                        Text(
                            text = "🔵Actively Looking for Android Roles",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium,
                            fontFamily = Poppins,
                            color = Color.White
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (-1.dp))
            ) {

                Text(
                    text = "I Focus On : ",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontFamily = Poppins,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "- Clean Architecture & MVVM for long-term scalablity  ",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Light,
                    color = Color.White,
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "- Performance-first UI with Compose ",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Light,
                    color = Color.White,
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "- Scaleable & Maintainable Codebases",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Light,
                    color = Color.White,
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )

            }
            Spacer(modifier = Modifier.height(18.dp))
            Column() {
                Text(modifier = Modifier.clickable{navController.navigate("contact")},
                    textDecoration = TextDecoration.Underline,
                    text = "📧 Let's build clean, scalable Android apps together",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Medium,
                    color = Color.Yellow,
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier
                        .padding(start = 32.dp)
                        .offset(y = -12.dp),
                    text = "(Available for internships & junior roles)",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Light,
                    color = Color.LightGray,
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )
            }

        }

    }
}



