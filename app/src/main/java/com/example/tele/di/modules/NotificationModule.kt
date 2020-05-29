package com.example.tele.di.modules

import androidx.lifecycle.ViewModel
import com.example.tele.di.ViewModelKey
import com.example.tele.ui.notifications.NotificationsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class NotificationModule {
    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel::class)
    abstract fun notificationsViewModel(notificationsViewModel: NotificationsViewModel): ViewModel
}