package com.elyeproj.modular1bottombase

import org.kodein.di.Kodein
import org.kodein.di.generic.*

val mainModule = Kodein.Module("Main") {
    bind<AppDependent>() with multiton {
        title: String, something: String -> AppDependent("$title $something", instance(), instance())
    }
}
