package com.example.composeweatherapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun CurrentWeather(navController: NavHostController) {
    // define your UI as a composable function
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Header("Málaga")
        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource( id = R.drawable.sunny),
                contentDescription = "Sunny Icon",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "25C", fontSize = 45.sp)
        }
        Text(text = stringResource(R.string.sunny), fontSize = 35.sp)
        Text(text = stringResource(R.string.windspeed), fontSize = 23.sp)
        Text(text = stringResource(R.string.humidity), fontSize = 23.sp)
        Spacer(modifier = Modifier.weight(1f))
        ElevatedButton(
            onClick = {
                // Navigate to second view
                navController.navigate("weatherForecastScreen")
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()) {
            Text(stringResource(R.string.forecast), fontSize = 20.sp)
        }
    }
}

// Mock preview due to parameters
@Preview
@Composable
fun CurrentWeatherPreview() {
    // nav controller
    val navController = rememberNavController()
    CurrentWeather(navController )
}

