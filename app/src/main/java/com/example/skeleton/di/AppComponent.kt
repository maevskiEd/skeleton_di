package com.example.skeleton.di

import com.example.skeleton.di.modules.AppModule
import com.example.skeleton.di.modules.DataModule
import com.example.skeleton.di.modules.DatabaseModule
import com.example.skeleton.di.modules.DomainModule
import com.example.skeleton.di.modules.RemoteModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        AppModule::class,
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class,
        DataModule::class
    ]
)
interface AppComponent {

}