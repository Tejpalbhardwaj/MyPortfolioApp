package com.example.tejpalportfolio.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tejpalportfolio.R

@Composable
fun Contact() {

    val uri = LocalUriHandler.current

    val FontFamily = FontFamily(
        Font(R.font.poppins_light, FontWeight.Light),
        Font(R.font.poppins_medium, FontWeight.Medium)
    )

    Box(modifier = Modifier.fillMaxSize().background(
            Brush.verticalGradient(
                listOf(
                    Color(0xFF0B0F10),
                    Color(0xFF101C1E),
                    Color(0xFF162E2B)
                )
            )
            )) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = " ")

            Spacer(modifier = Modifier.height(240.dp))

            Text(
                text = "📞 Contact Me ", fontSize = 12.sp,
                color = Color.White,
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Let's build something together", fontSize = 12.sp,
                color = Color.White,
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {

                    Text(
                        text = "📱+91 7027774015",
                        fontSize = 18.sp,
                        color = Color.White,
                        fontFamily = FontFamily,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {
                            uri.openUri("tel:+917027774015")
                        }
                    )
                    Spacer(modifier = Modifier.height(12.dp))


                    Text(
                        text = "🔗 LinkdIn/Tejpal_Bhardwaj",
                        fontSize = 18.sp,
                        color = Color(0xFF2196F3),
                        fontFamily = FontFamily,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.clickable {
                            uri.openUri("https://www.linkedin.com/in/tejpal-bhardwaj1088/")
                        }
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "🔗 Github/Tejpal_Bhardwaj",
                        fontSize = 18.sp,
                        color = Color(0xFF2196F3),
                        fontFamily = FontFamily,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.clickable {
                            uri.openUri("https://github.com/Tejpalbhardwaj")
                        }
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "📧 tejpalbhardwaj1088@gmail.com",
                        fontSize = 18.sp,
                        color = Color(0xFF2196F3),
                        fontFamily = FontFamily,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.clickable {
                            uri.openUri("mailto:tejpalbhardwaj1088@gmail.com")
                        }
                    )
                }
            }



        }

        Column(modifier = Modifier.fillMaxSize() , horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "")
            Spacer(modifier = Modifier.height(640.dp))
            Text(
                text = "🤝 Let's build clean, scalable Android apps together",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Medium,
                color = Color.Yellow,
                fontFamily = FontFamily,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier
                    .padding(start = 27.dp)
                    .offset(y = -12.dp),
                text = "(Available for internships & junior roles)",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Light,
                color = Color.LightGray,
                fontFamily = FontFamily,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}