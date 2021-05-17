package yzx.util.streamline

import android.app.Application

private lateinit var application_: Application

val application: Application
    get() = application_


object Streamline {

    fun init(application: Application) {
        application_ = application
    }

}