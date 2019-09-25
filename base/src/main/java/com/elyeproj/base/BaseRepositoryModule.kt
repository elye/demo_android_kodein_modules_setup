package com.elyeproj.base

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

val baseRepositoryModule = Kodein.Module("BaseRepository") {
    bind<BaseRepository>() with singleton {
        BaseRepository("From baseRepositoryModule BaseRepository")
    }
}
