package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltDependenciasNomeadas.Classes

import android.util.Log
import javax.inject.Inject

class Banda @Inject constructor (private val guitarra : InterfaceInstrumento, private val violao : InterfaceInstrumento, private val bateria : InterfaceInstrumento ) {

    fun tudoSendoTocado() : String {

        val texto = "Banda tocando"

        violao.sendoTocado()

        bateria.sendoTocado()

        guitarra.sendoTocado()

        Log.w("msg_hilt", "Banda tocando")

        return texto
    }
}
