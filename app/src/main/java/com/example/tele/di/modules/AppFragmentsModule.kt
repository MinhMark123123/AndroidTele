package com.example.tele.di.modules

import com.example.tele.di.ViewModelBuilder
import com.example.tele.ui.dashboard.DashboardFragment
import com.example.tele.ui.home.HomeFragment
import com.example.tele.ui.notifications.NotificationsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppFragmentsModule {
    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun statisticsFragment(): DashboardFragment

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun homeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun notificationFragment(): NotificationsFragment
}