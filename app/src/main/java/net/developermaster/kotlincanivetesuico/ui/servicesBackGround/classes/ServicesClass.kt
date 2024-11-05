package net.developermaster.kotlincanivetesuico.ui.servicesBackGround.classes

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ServicesClass : Service() {
    override fun onBind(servicos: Intent?): IBinder? {
        return null
    }

    //todo criar servico
    override fun onCreate() {
        super.onCreate()
        Log.d("MyService", "Serviço criado")

        Toast.makeText(applicationContext, "Serviço criado", Toast.LENGTH_SHORT).show()
    }

    //todo iniciar servico
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Aqui você coloca a lógica do serviço

        //todo bundle intent extras
        val bundle = intent?.extras

        //todo key bundle
        val tempoDuracao = bundle?.getLong("tempoDuracao")

        //todo tempo duracao
        val tempo = tempoDuracao ?: 2000L //todo a cada 2 segundos executa o codigo abaixo

        //todo Couroutines global
        GlobalScope.launch {
            repeat(10){ contador ->
                delay(tempo)
                Log.i("MyService", "Serviço iniciado com Couroutines: $contador tempo: $tempo")
            }
            stopSelf()
        }
        Log.d("MyService", "Serviço iniciado")

        Toast.makeText(applicationContext, "Serviço iniciado", Toast.LENGTH_SHORT).show()

        // Retorna START_STICKY para que o serviço seja reiniciado automaticamente
//        stopSelf()

        // Retorna START_NOT_STICKY para que o serviço não seja reiniciado automaticamente
        return START_NOT_STICKY
    }

    //todo threads
    inner class MinhaThread : Thread(){
        override fun run() {
            super.run()
            repeat(15){ contador ->
                sleep(2000)
                Log.i("MyService", "Serviço iniciado com threads: $contador")
            }
            stopSelf()
        }
    }

    //todo parar servico
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyService", "Serviço parado")

        Toast.makeText(applicationContext, "Serviço parado", Toast.LENGTH_SHORT).show()

    }
}