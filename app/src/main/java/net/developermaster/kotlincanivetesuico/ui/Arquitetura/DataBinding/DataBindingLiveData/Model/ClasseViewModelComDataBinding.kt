package net.developermaster.kotlincanivetesuico.ui.Arquitetura.DataBinding.DataBindingLiveData.Model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClasseViewModelComDataBinding : ViewModel() {

    //todo variavel contador
    private var contador = 0

    var texto: String = "Hello, Databinding!"

    //todo variavel livedata do que esta sendo observado // observavel //
    private var liveDataDoQueEstaSendoObservado = MutableLiveData< Int > ()

    //todo variavel texto da caixa de texto
    var textoDaCaixaDeTexto: String = " "//todo variavel vazia

    fun recuperarLiveData() : MutableLiveData<Int> {

        liveDataDoQueEstaSendoObservado.value = contador //todo a variavel livedata recebo o contador com valor 0

        return liveDataDoQueEstaSendoObservado

    }

    fun adicionarMaisUmParaCadaClique() {

        contador++
        liveDataDoQueEstaSendoObservado.value = contador //todo contador adiciona + 1

    }

    fun recuperaTextoDigitado() : String {

        return " Lucia "


    }

}