package com.example.composeweatherapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun WeatherForecast(navController: NavHostController) {
    // Second screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Header("Málaga")
        Spacer(modifier = Modifier.height(40.dp))

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically // Align children vertically centered
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sunny),
                    contentDescription = "Sunny Icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp)) // Add some space between the image and text
                Text(
                    text = stringResource(R.string.monday),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically // Align children vertically centered
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sunny),
                    contentDescription = "Sunny Icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(20.dp)) // Add some space between the image and text
                Text(
                    text = stringResource(R.string.tuesday),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
        }


        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically // Align children vertically centered
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cloudy),
                    contentDescription = "Cloudy Icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp)) // Add some space between the image and text
                Text(
                    text = stringResource(R.string.wednesday),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically // Align children vertically centered
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cloudy),
                    contentDescription = "Cloudy Icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp)) // Add some space between the image and text
                Text(
                    text = stringResource(R.string.thursday),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically // Align children vertically centered
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sunny),
                    contentDescription = "Sunny Icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp)) // Add some space between the image and text
                Text(
                    text = stringResource(R.string.friday),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))
        ElevatedButton(
            onClick = {
                // Navigate to first view
                navController.navigate("currentWeatherScreen")
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(stringResource(R.string.go_back),
                fontSize = 20.sp)
        }
    }
}

@Preview
@Composable
fun WeatherForecastPreview() {
    // nav controller
    val navController = rememberNavController()
    WeatherForecast(navController )
}