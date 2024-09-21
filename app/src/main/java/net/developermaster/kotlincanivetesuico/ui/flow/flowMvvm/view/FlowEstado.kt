package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view

sealed class FlowEstado {

    object Loading : FlowEstado()

    data class Success( val clientes: Int ) : FlowEstado()

    data class Error( val mensagemError: String ) : FlowEstado()
}