package com.example.siriusdi.di

import com.example.siriusdi.data.UserRepository
import com.example.siriusdi.di.modules.NetworkModule
import com.example.siriusdi.di.modules.SubcomponentsModule
import dagger.Component

/**
 * @author n.d.grebnev
 */
@Component(
    modules = [
        NetworkModule::class,
        SubcomponentsModule::class
    ]
)
interface ApplicationComponent {

    fun userRepository(): UserRepository

    fun loginComponent(): LoginComponent.Factory
}
