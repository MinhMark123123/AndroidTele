package com.example.tele.di.modules

import com.example.tele.di.ViewModelBuilder
import com.example.tele.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppActivityModule {
    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    abstract fun mainActivity(): MainActivity
}