package net.developermaster.kotlincanivetesuico.ui.arquitetura.liveData.liveDataSimples.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelLiveDataSimples : ViewModel() {

    //todo variavel contador
    private var contador = 0

    //todo variavel texto da caixa de texto
    var variavelString: String = ""

    //todo variavel livedata do que esta sendo observado // observavel //
    private var liveDataDoQueEstaSendoObservado = MutableLiveData<Int>()

    fun recuperarLiveData(): MutableLiveData<Int> {

        liveDataDoQueEstaSendoObservado.value = contador // a variavel livedata recebo o contador com valor 0

        return liveDataDoQueEstaSendoObservado
    }

    fun adicionarMaisUmParaCadaClique() {

        contador++

        liveDataDoQueEstaSendoObservado.value = contador // contador adiciona + 1
    }

    fun subtraiMaisUmParaCadaClique() {

        contador--

        liveDataDoQueEstaSendoObservado.value = contador // contador subtrai + 1
    }
}