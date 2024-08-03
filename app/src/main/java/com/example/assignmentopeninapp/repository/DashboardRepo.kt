package com.example.assignmentopeninapp.repository

import com.example.assignmentopeninapp.data.model2.Dashboard2

interface DashboardRepo {
    suspend fun getDashboard(): Dashboard2
}