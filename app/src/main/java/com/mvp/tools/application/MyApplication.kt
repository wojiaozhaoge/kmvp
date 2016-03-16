package com.mvp.tools.application

import android.app.Application
import android.content.Context

/**
 * Created by ZG
 */
//class MyApplication : android.app.Application() {
//
//    private val _appComponent: AppComponent by lazy {
//        DaggerAppComponent.builder().appModule(AppModule(this)).build()
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//
//        _setupAnalytics()
//    }
//
//    private fun _setupAnalytics() {
//        if (BuildConfig.DEBUG) {
//            Timber.plant(Timber.DebugTree())
//            Stetho.initialize(Stetho.newInitializerBuilder(this)
//                    .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                    .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this)).build())
//        }
//    }
//
//    public fun getAppComponent() = _appComponent
//
//    companion object {
//
//        fun getApplicationContext(context: Context) = context.applicationContext as Application
//    }
//
//}