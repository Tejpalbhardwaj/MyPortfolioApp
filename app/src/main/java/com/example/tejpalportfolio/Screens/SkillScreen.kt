package com.example.tejpalportfolio.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tejpalportfolio.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SkillsScreen() {

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
                .fillMaxWidth()
                .padding(top = 12.dp).verticalScroll(rememberScrollState())
        )
        {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Column() {
                        Text(
                            text = "Languages - Kotlin , Java",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Poppins,
                            fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp),
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(6.dp))

                        Row() {
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.kotlin),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.java),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                        }


                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Column() {
                        Text(
                            text = "UI - Jetpack Compose , XML , Material Design",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Poppins,
                            fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp),
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(6.dp))

                        Row() {
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.xml),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.compose),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.material_ui),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                        }


                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Column() {
                        Text(
                            text = "Architecture - MVVM",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Poppins,
                            fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp),
                            color = Color.White
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Column() {
                        Text(
                            text = "Database - Room Database ",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Poppins,
                            fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp),
                            color = Color.White
                        )

                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Column() {
                        Text(
                            text = "Tools - Android Studio , Git ,GitHub , Postman",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Poppins,
                            fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp),
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(6.dp))

                        Row() {
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.studio),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.github),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                            Card(
                                modifier = Modifier.padding(8.dp),
                                shape = RectangleShape,
                                elevation = CardDefaults.cardElevation(12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.postman),
                                    contentDescription = "Profile Image",
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                        }


                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1B2F2C)
                )
            ) {
                Box(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Column() {
                        Text(
                            text = " Rest API's , Retrofit , Firebase , JSON ,   ",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Poppins,
                            fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp),
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

        }
    }
}

