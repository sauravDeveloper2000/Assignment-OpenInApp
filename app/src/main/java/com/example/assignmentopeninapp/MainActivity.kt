package com.example.assignmentopeninapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import com.example.assignmentopeninapp.ui.home_screen.HomeScreen
import com.example.assignmentopeninapp.ui.home_screen.HomeScreenViewModel
import com.example.assignmentopeninapp.ui.theme.AssignmentOpenInAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val homeScreenViewModel: HomeScreenViewModel by viewModels()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentOpenInAppTheme {
                val dashboardApiResponse = homeScreenViewModel.dashBoardApiStatus.collectAsState()
                HomeScreen(dashboardApiResponse = dashboardApiResponse.value)
            }
        }
    }
}
