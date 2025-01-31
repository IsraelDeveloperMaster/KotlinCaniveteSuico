package net.developermaster.kotlincanivetesuico.ui.services.servicesBackGround.classes

import android.app.Service
import android.content.Intent
import android.os.IBinder

class ServiceGeradoAutomaticamente : Service() {

    override fun onBind(intent: Intent): IBinder? {

        return null
    }

    override fun onCreate() {
        super.onCreate()

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        return START_STICKY
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return true
    }

    override fun onLowMemory() {
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)

    }
    //todo
    override fun onTrimMemory(level: Int) {

    }

    override fun onTaskRemoved(rootIntent: Intent?) {

    }

    override fun onDestroy() {

    }
}