package com.example.assignmentopeninapp.data.api

import com.example.assignmentopeninapp.data.model2.Dashboard2
import retrofit2.http.GET

interface DashboardApiService {

    @GET("api/v1/dashboardNew")
    suspend fun getDashboard(
    ): Dashboard2

}