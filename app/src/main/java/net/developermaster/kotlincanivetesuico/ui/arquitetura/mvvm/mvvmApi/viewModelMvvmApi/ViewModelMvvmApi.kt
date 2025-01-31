package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.viewModelMvvmApi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmApi
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.Model.PostagemApiJsonPlaceHolder_MvvmApi

class ViewModelMvvmApi : ViewModel(){

    //todo gera a listagem das postagens
    val listaDePostagens = MutableLiveData< List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi> >()

    fun recuperaPostagensApiJsonPlaceHolder() {

        val postagemapijsonplaceholderMvpapi = PostagemApiJsonPlaceHolder_MvvmApi()

        //todo controla o ciclo de vida da activity
        viewModelScope.launch {

            val postagemApiRecuperadasMvvmApi = postagemapijsonplaceholderMvpapi.funcaoRecuperaPostagens()

            listaDePostagens.postValue( postagemApiRecuperadasMvvmApi )
        }
    }
}