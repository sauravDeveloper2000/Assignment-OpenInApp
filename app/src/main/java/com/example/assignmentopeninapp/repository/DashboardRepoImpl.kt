package com.example.assignmentopeninapp.repository

import com.example.assignmentopeninapp.data.api.DashboardApiService
import com.example.assignmentopeninapp.data.model2.Dashboard2
import javax.inject.Inject

class DashboardRepoImpl @Inject constructor(
    private val dashboardApiService: DashboardApiService
) : DashboardRepo {
    override suspend fun getDashboard(): Dashboard2 {
        return dashboardApiService.getDashboard()
    }
}