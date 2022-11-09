package com.jgeun.study.sharedpreferences_example

import android.app.Application

class MyApplication : Application() {
    companion object {
        lateinit var preferenceUtil: PreferenceUtil
    }

    override fun onCreate() {
        preferenceUtil = PreferenceUtil(applicationContext)
        super.onCreate()
    }
}