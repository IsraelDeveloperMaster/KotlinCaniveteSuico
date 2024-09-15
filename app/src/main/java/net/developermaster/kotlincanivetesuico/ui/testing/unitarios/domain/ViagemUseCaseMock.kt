package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.exercicio.InterfaceViagemRepository

class ViagemUseCaseMock(
     val interfaceViagemRepository: InterfaceViagemRepository
) {

    suspend fun listarLocais() : List<Pair<String, String>> {

        return interfaceViagemRepository.listarLocais()
    }

    suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double) : Double {

        //Recuperar dados da API: Distância
        return interfaceViagemRepository.calcularPrecoViagem(distancia, precoKM)
    }
}