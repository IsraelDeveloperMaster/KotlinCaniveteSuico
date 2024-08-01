package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltDependenciasNomeadas.Classes

import android.util.Log

class Violao : InterfaceInstrumento {

    override fun sendoTocado() {

        val texto = "Violão sendo tocado"

        Log.w("msg_hilt", texto)
    }
}
