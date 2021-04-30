package com.reo.running.di_practice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object ActionModule {
    @Provides
    fun provideAction(): Action = Action()

}