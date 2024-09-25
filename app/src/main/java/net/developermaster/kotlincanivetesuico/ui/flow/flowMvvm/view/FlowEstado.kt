package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view

sealed class FlowEstado {

    object Loading : FlowEstado()

    data class Sucesso1(val clientes: Int ) : FlowEstado()

    data class Sucesso2(val clientes: String ) : FlowEstado()

    data class Error( val mensagemError: String ) : FlowEstado()
}