package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes

import javax.inject.Inject

class CarroSemConstrutor @Inject constructor ( ) {

    fun motoristaAcionaMotor(): String {

        val motorHyblido = MotorHyblido( "Suzuki" )

        motorHyblido.acionarMotorPelaInterface()

        val texto = "Motorista Aciona Motor sem construtor Hilt"

        return texto
    }
}