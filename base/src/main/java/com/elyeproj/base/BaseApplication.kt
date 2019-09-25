package com.elyeproj.base

import android.app.Application
import org.kodein.di.Kodein

class BaseApplication: Application() {
    companion object {
        val kodein = Kodein {
            import(baseNetworkModule)
            import(baseRepositoryModule)
        }
    }
}