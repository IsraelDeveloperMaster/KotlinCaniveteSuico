package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.domain

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.exercicio.InterfaceViagemRepository

class ViagemUseCaseImplementacao : InterfaceViagemRepository {

    override suspend fun listarLocais(): List<Pair<String, String>> {

        val lista = listOf(Pair("Rio de Janeiro", "RJ"))

        return lista
    }

    override suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double): Double {

        return 50.0
    }
}