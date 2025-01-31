package net.developermaster.kotlincanivetesuico.ui.arquitetura.viewModel.viewModelContador.viewModel

import androidx.lifecycle.ViewModel

class ViewModelContador : ViewModel() {

    //todo variavel contador
    private var contador = 0

    //todo variavel texto da caixa de texto
    var textoDaCaixaDeTexto: String = ""

    fun recuperarContador(): Int {

        return contador
    }

    fun adicionarMaisUmParaCadaClique() {

        contador++
    }

    fun recuperaTextoDigitado(): String {

        return " Lucia "
    }
}