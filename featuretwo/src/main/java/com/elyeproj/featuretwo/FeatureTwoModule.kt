package com.elyeproj.featuretwo

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

val featureTwoModule = Kodein.Module("FeatureTwo") {
    bind<FeatureTwoDependent>() with singleton {
        FeatureTwoDependent("From featureTwoModule FeatureTwoDependent", instance(), instance())
    }
}
