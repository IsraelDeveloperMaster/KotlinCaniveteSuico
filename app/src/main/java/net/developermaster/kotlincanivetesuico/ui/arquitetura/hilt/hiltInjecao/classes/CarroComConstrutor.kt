package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes

import android.content.Context
import android.view.Gravity
import android.widget.Toast
import javax.inject.Inject

class CarroComConstrutor @Inject constructor (private val interfaceMotor : InterfaceMotor, val context: Context)  {//

    fun motoristaAcionaMotor() : String {

        interfaceMotor.acionarMotorPelaInterface()

        mensagemToast( "Motorista Aciona Motor com construtor Hilt" )

        var texto = "Motorista Aciona Motor com construtor Hilt"

        return texto

    }
        fun mensagemToast (msg : String )  {
                //todo exibe a mensagem
                val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
                //todo posicao do  toast
                toast.setGravity(Gravity.CENTER, 0, 0)
                //todo Mostra o toast
                toast.show()
            }
}

