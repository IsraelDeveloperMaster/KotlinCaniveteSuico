package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes

import android.util.Log

class MotorHyblido(private val marcaCarroHybrido: String ) : InterfaceMotor {

    override fun acionarMotorPelaInterface() {

        val texto = "Carro acionado pela Interface \n com Motor Hybrido com Hilt \n Marca: $marcaCarroHybrido"

        Log.w("msg_hilt", texto)
    }
}