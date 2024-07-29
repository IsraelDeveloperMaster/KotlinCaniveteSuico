package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltDependenciasNomeadas.Classes

import android.util.Log

class Bateria : InterfaceInstrumento {

    override fun sendoTocado() {

        val texto = "Bateria sendo tocada"

        Log.w("msg_hilt", texto)
    }
}
