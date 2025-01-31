package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view

sealed class FlowEstado {

    object Loading : FlowEstado()

    //todo model sucesso 1
    data class Sucesso1(val clientes: Int ) : FlowEstado()

    //todo model sucesso 2
    data class Sucesso2(val clientes: String ) : FlowEstado()

    //todo model erro
    data class Error( val mensagemError: String ) : FlowEstado()
}