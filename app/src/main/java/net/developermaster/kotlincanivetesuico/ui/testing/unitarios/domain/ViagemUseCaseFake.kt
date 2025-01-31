package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.exercicio.InterfaceViagemRepository

class ViagemUseCaseFake( val interfaceViagemRepository: InterfaceViagemRepository ) {

    suspend fun listarLocaisFake() : List<Pair<String, String>> {
        return interfaceViagemRepository.listarLocais()
    }

    suspend fun calcularPrecoViagemFake(distancia: Double, precoKM: Double) : Double {
        //Recuperar dados da API: Distância
        return interfaceViagemRepository.calcularPrecoViagem(distancia, precoKM)
    }
}