package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

/*
* Timber uses the Application class because the whole app will be using this logging library,
* and the library needs to be initialized once, before everything else is set up
* */
class ClickerApplication :Application(){

    override fun onCreate() {
        super.onCreate()
        /*This line of code initializes the Timber library for your app
            so that you can use the library in your activities.*/
        Timber.plant(Timber.DebugTree())
    }


}