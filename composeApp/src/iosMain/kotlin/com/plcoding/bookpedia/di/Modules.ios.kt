package com.plcoding.bookpedia.di

import com.plcoding.bookpedia.book.data.database.DataBaseFactory
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module
    get() = module {
        single<HttpClientEngine> { Darwin.create() }
        single { DataBaseFactory() }
    }