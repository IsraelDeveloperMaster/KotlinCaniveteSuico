package net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes

import android.app.Application
import android.app.Service
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Binder
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.R

class ServicesClassForeGround : Service() {

    private val coroutine = CoroutineScope(Dispatchers.IO)

    //todo contador
    var cronometro = 0

    //todo Ibinder class
    inner class MyBinder : Binder() {

        fun recuperarService(): ServicesClassForeGround {
            return this@ServicesClassForeGround
        }

    }

    //todo onBind
    override fun onBind(servicos: Intent?): IBinder? {
        return MyBinder()
    }

    //todo criar servico
    override fun onCreate() {
        super.onCreate()

        Log.d("MyService", "Serviço criado")

        Toast.makeText(applicationContext, "Serviço criado", Toast.LENGTH_SHORT).show()
    }

    //todo iniciar servico
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val idChannel = "notification_channel_id"

        //todo notificacao
        val notificacao = NotificationCompat.Builder(applicationContext, idChannel).apply {

            //todo titulo
            setContentTitle("Serviço Foreground")

            //todo texto
            setContentText("Serviço Foreground em execução")

            //todo icone pequeno
            setSmallIcon(android.R.drawable.ic_dialog_info)

            //todo hora
            setShowWhen(true)

            //todo icone grande
            setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.perfil_01))
        }

        //todo ForegroundService
        startForeground(1, notificacao.build())


        //todo bundle intent extras
        val bundle = intent?.extras

        //todo key bundle
        val tempoDuracao = bundle?.getLong("tempoDuracao")

        //todo tempo duracao
        val tempo = tempoDuracao ?: 2000L //todo a cada 2 segundos executa o codigo abaixo

        //todo Couroutines para iniciar servico
        coroutine.launch {

            repeat(10) { contador ->

                cronometro = contador

                delay(tempo)

                Log.i(
                    "MyService",
                    "Serviço iniciado com Couroutines: $contador tempo: $tempo, cronometro: $cronometro"
                )
            }

            stopSelf()
        }

        Toast.makeText(applicationContext, "Serviço iniciado", Toast.LENGTH_SHORT).show()

        return super.onStartCommand(intent, flags, startId)
    }

    //todo threads
    inner class MinhaThread : Thread() {
        override fun run() {
            super.run()
            repeat(15) { contador ->
                sleep(2000)
                Log.i("MyService", "Serviço iniciado com threads: $contador")
            }
            stopSelf()
        }
    }

    //todo parar servico
    override fun onDestroy() {
        super.onDestroy()

        //todo cancelar coroutine
        coroutine.cancel()
        Log.d("MyService", "Serviço parado")
        Toast.makeText(applicationContext, "Serviço parado", Toast.LENGTH_SHORT).show()
    }
}