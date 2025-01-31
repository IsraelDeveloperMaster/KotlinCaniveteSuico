package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.fakeRepository

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.exercicio.InterfaceViagemRepository

class FakeViagemRepository : InterfaceViagemRepository {

    override suspend fun listarLocais(): List<Pair<String, String>> {

       return listOf( Pair("Rio de Janeiro", "RJ") )
    }

    override suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double): Double {

        val distanciaPercorrida = 10.0
        val precoKilometros = 2.0

        return ( distanciaPercorrida * precoKilometros )
    }
}