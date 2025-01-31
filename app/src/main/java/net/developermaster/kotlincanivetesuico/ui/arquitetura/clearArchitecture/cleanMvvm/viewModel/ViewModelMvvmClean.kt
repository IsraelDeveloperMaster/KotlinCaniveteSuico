package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository.RepositorioDataMvvmClean

class ViewModelMvvmClean(private val interfaceRepositorio : RepositorioDataMvvmClean) : ViewModel()  {//todo injecao do postagemrepositorioapijsonplaceholderMvvmclean

    //todo gera a listagem das postagens
    var listaDePostagens = MutableLiveData < List <ModelApiMvvmClean> >()

        //todo recupera a lista de postagens recuperada do postagem repositorio
        get() = interfaceRepositorio.listaDePostagensRecuperadaDoRepositorio

    fun recuperaPostagensApiJsonPlaceHolder() {

        //todo controla o ciclo de vida da activity
        viewModelScope.launch {

            interfaceRepositorio.funcaoRecuperaPostagens()
        }
    }
}