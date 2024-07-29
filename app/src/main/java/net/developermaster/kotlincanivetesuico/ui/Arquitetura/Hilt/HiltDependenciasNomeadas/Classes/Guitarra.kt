package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltDependenciasNomeadas.Classes

import android.util.Log

class Guitarra : InterfaceInstrumento {

    override fun sendoTocado() {

        val texto = "Guitarra sendo tocado"

        Log.w("msg_hilt", texto)
    }
}
