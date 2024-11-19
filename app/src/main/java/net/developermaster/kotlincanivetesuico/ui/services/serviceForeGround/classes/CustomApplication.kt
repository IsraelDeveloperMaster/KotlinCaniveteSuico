package net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes

import android.app.Application
import android.app.NotificationManager
import android.os.Build

class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //todo criar canais
        criarCanais()

    }

    fun criarCanais() {

        //todo criar canais if android 8.0 ou superior
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            //todo canal de notificacao com id, nome e importancia
            val canalLembrete = android.app.NotificationChannel(
                "notification_channel_id",
                "Lembrete",
                NotificationManager.IMPORTANCE_HIGH
            )

            //todo criar canal de notificacao com gerenciador
            val manager = getSystemService(NotificationManager::class.java) as NotificationManager
            manager.createNotificationChannel(canalLembrete)
        }
    }
}