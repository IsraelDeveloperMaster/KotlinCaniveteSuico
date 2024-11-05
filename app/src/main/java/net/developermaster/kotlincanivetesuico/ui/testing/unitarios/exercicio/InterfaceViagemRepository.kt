package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.exercicio

interface InterfaceViagemRepository {

    suspend fun listarLocais() : List<Pair<String, String>>

    suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double) : Double
}