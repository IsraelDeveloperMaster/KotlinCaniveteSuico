package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.view

class PostagemTeste {

    fun recuperarPostagens(): List<String> {

        return listOf( "maria" , "ana" , "carlos" )
    }
}

fun main() {

    val postagensRetornada = PostagemTeste()
    val lista = postagensRetornada.recuperarPostagens()

    println( lista )
}
