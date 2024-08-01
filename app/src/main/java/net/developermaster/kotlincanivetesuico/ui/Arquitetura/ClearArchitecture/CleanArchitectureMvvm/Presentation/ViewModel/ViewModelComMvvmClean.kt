package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Presentation.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmClean
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Repository.InterfaceRepositorioData_MvvmClean

class ViewModelComMvvmClean(private val interfaceRepositorio : InterfaceRepositorioData_MvvmClean) : ViewModel()  {//todo injecao do postagemrepositorioapijsonplaceholderMvvmclean

    //todo gera a listagem das postagens
    var listaDePostagens = MutableLiveData < List <ClasseDeDadosAPIJsonPlaceHolder_MvvmClean> >()

        //todo recupera a lista de postagens recuperada do postagem repositorio
        get() = interfaceRepositorio.listaDePostagensRecuperadaDoRepositorio

    fun recuperaPostagensApiJsonPlaceHolder() {

        //todo controla o ciclo de vida da activity
        viewModelScope.launch {

            interfaceRepositorio.funcaoRecuperaPostagens()
        }
    }
}