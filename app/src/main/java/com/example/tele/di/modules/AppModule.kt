package com.example.tele.di.modules

import dagger.Module

@Module(
    includes = [
        AppActivityModule::class,
        AppFragmentsModule::class,
        DashBoardModule::class,
        HomeModule::class,
        NotificationModule::class
    ]
)
abstract class AppModule {}