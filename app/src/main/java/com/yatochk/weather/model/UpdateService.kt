package com.yatochk.weather.model

import android.app.Service
import android.content.Intent
import android.os.IBinder

class UpdateService : Service() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

}