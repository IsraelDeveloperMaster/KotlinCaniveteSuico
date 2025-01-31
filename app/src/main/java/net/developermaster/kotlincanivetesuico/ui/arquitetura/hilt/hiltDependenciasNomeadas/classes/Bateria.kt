package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes

import android.util.Log

class Bateria : InterfaceInstrumento {

    override fun sendoTocado() {

        val texto = "Bateria sendo tocada"

        Log.w("msg_hilt", texto)
    }
}
