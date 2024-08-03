package com.example.assignmentopeninapp.ui.home_screen

import com.example.assignmentopeninapp.data.model2.Dashboard2

sealed interface DashboardApiResponse {
    data object Loading : DashboardApiResponse
    data class SuccessCase(val dashboard: Dashboard2) : DashboardApiResponse
    data class ErrorCase(val cause: String) : DashboardApiResponse
}