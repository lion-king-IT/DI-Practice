package com.reo.running.di_practice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ActionModule {
    @Provides
    @Singleton
    fun provideAction(): Action = Action()

}