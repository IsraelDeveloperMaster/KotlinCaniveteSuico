package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean

interface RepositorioDataMvvmClean { //todo todos os repositorios terao que implementar essas funcoes // CONTRATO //ABSTRACAO

    //todo recupera a lista
    val listaDePostagensRecuperadaDoRepositorio : MutableLiveData <List<ModelApiMvvmClean>>

    //todo metodo recupera os dados
    suspend fun funcaoRecuperaPostagens()
}