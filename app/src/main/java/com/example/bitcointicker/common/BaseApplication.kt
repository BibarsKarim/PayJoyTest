package com.example.bitcointicker.common

import android.app.Application
import com.example.bitcointicker.data.modules.bitcoinModule
import com.example.bitcointicker.data.modules.netWorkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication:Application(){
    companion object{
        lateinit var context: BaseApplication
        val allAppModules = listOf(netWorkModule, bitcoinModule)
    }

    override fun onCreate() {
        super.onCreate()
        context=this
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(allAppModules)
        }
    }
}