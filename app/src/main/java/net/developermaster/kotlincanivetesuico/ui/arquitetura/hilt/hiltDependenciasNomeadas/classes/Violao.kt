package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes

import android.util.Log

class Violao : InterfaceInstrumento {

    override fun sendoTocado() {

        val texto = "Violão sendo tocado"

        Log.w("msg_hilt", texto)
    }
}
