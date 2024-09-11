package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes

import android.content.Context
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import javax.inject.Inject

class Musico @Inject constructor (private val interfaceInstrumento : InterfaceInstrumento, val context: Context ) {

    fun tocar() : String  {

        val texto = "Musico tocando"

        interfaceInstrumento.sendoTocado()

        mensagemToast( "Musico tocando" )

        Log.w("msg_hilt", texto)

        return texto
    }

    fun mensagemToast ( mensagem : String )  {
        //todo exibe a mensagem
        val toast = Toast.makeText(context, mensagem, Toast.LENGTH_LONG)
        //todo posicao do  toast
        toast.setGravity(Gravity.CENTER, 0, 0)
        //todo Mostra o toast
        toast.show()
    }
}




