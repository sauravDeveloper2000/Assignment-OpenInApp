package com.example.assignmentopeninapp.ui.home_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignmentopeninapp.repository.DashboardRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import okio.IOException
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val dashboardRepo: DashboardRepo
) : ViewModel() {

    var dashBoardApiStatus = MutableStateFlow<DashboardApiResponse>(DashboardApiResponse.Loading)
        private set

    init {
        getDashboardDetails()
    }

    private fun getDashboardDetails() {
        viewModelScope.launch {
            dashBoardApiStatus.value = DashboardApiResponse.Loading
            dashBoardApiStatus.value = try {
                val response = dashboardRepo.getDashboard()
                DashboardApiResponse.SuccessCase(dashboard = response)
            } catch (exception: IOException) {
                DashboardApiResponse.ErrorCase(cause = exception.toString())
            }
        }
    }
}