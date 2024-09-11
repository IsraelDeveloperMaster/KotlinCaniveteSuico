package net.developermaster.kotlincanivetesuico.ui.arquitetura.liveData.liveDataContador.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelLiveDataContador : ViewModel() {

    //todo variavel contador
    private var contador = 0

    //todo variavel livedata do que esta sendo observado // observavel //
    private var liveDataDoQueEstaSendoObservado = MutableLiveData< Int > ()

    //todo variavel texto da caixa de texto
    var textoDaCaixaDeTexto: String = ""

    fun recuperarLiveData() : MutableLiveData< Int > {

        liveDataDoQueEstaSendoObservado.value = contador // a variavel livedata recebo o contador com valor 0

        return liveDataDoQueEstaSendoObservado
    }

    fun adicionarMaisUmParaCadaClique() {

        contador++
        liveDataDoQueEstaSendoObservado.value = contador // contador adiciona + 1
    }

    fun recuperaTextoDigitado() : String {

        return " Lucia "
    }
}