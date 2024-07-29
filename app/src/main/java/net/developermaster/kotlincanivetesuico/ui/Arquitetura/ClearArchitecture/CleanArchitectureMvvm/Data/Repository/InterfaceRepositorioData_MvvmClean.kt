package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmClean

interface InterfaceRepositorioData_MvvmClean { //todo todos os repositorios terao que implementar essas funcoes // CONTRATO //ABSTRACAO

    //todo recupera a lista
    val listaDePostagensRecuperadaDoRepositorio : MutableLiveData <List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>

    //todo metodo recupera os dados
    suspend fun funcaoRecuperaPostagens()
}