package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.auxiliar

class OperacoesBasicas {

    fun formataData( data : String ) : String {//22102025 - 2025-10-22

        //Simular formatação de data
        return "22/10/2025"
    }

    fun exibirAlerta() : Boolean {

        return true
    }

    suspend fun recuperarDadosAPI() : List<String> {

        return listOf( "jamilton", "ana", "maria", "pedro" )
    }

}