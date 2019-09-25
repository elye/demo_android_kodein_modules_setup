package com.elyeproj.base

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

val baseNetworkModule = Kodein.Module("BaseNetwork") {
    bind<BaseNetwork>() with singleton {
        BaseNetwork("From baseNetworkModule BaseNetwork")
    }
}
