package com.example.tele.di.modules

import androidx.lifecycle.ViewModel
import com.example.tele.di.ViewModelKey
import com.example.tele.ui.dashboard.DashboardViewModel
import com.example.tele.ui.notifications.NotificationsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class DashBoardModule {
    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun dashBoardViewModel(dashboardViewModel: DashboardViewModel): ViewModel
}