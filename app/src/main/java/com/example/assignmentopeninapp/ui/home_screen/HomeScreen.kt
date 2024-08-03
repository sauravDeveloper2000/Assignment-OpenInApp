package com.example.assignmentopeninapp.ui.home_screen

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    dashboardApiResponse: DashboardApiResponse
) {
    when (dashboardApiResponse) {
        is DashboardApiResponse.ErrorCase -> {
            Log.d("HomeScreen", "HomeScreen: ${dashboardApiResponse.cause}")
        }

        DashboardApiResponse.Loading -> {
            Log.d("HomeScreen", "HomeScreen: Loading")
        }

        is DashboardApiResponse.SuccessCase -> {
            Log.d("HomeScreen", "HomeScreen: ${dashboardApiResponse.dashboard}")
        }
    }
}