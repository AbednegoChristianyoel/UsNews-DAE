package com.example.usnews

import android.app.Application
import com.example.newsapp.core.di.databaseModule
import com.example.newsapp.core.di.networkModule
import com.example.newsapp.core.di.repositoryModule
import com.example.usnews.di.useCaseModule
import com.example.usnews.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}