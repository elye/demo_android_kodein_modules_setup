package com.elyeproj.featureone

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

val featureOneModule = Kodein.Module("FeatureOne") {
    bind<FeatureOneDependent>() with singleton {
        FeatureOneDependent("From featureOneModule FeatureOneDependent", instance(), instance())
    }
}
