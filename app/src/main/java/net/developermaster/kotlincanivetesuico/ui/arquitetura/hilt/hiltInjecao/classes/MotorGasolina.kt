package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes

import android.util.Log

class MotorGasolina(private val marcaCarroGasolina : String ) : InterfaceMotor {

    override fun acionarMotorPelaInterface() {

        val texto = "Carro acionado pela Interface \n com Motor Gasolina com Hilt \n Marca: $marcaCarroGasolina"

        Log.w("msg_hilt", texto)
    }
}
