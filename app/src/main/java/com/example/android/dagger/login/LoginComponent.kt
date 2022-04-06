package com.example.android.dagger.login

import com.example.android.dagger.di.StorageModule
import dagger.Subcomponent

@Subcomponent(modules = [StorageModule::class])
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun injection(activity: LoginActivity)
}