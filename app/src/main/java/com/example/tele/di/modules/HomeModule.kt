package com.example.tele.di.modules

import androidx.lifecycle.ViewModel
import com.example.tele.di.ViewModelKey
import com.example.tele.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun homeViewModel(homeViewModel: HomeViewModel): ViewModel
}