package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean

class RepositorioDataFireBaseMvvmClean : RepositorioDataMvvmClean {

    //todo recupera a lista
    override val listaDePostagensRecuperadaDoRepositorio = MutableLiveData<List<ModelApiMvvmClean>>()

    //todo metodo recupera os dados
    override suspend fun funcaoRecuperaPostagens() {

        //todo simula uma solicitacao por banco de dados ao inves de por api
        val listaRecuperadaPeloRepositorio = listOf(

            ModelApiMvvmClean("corpo" , 1,"Sucesso FireBase Repositorio 1" ,2 ) ,
            ModelApiMvvmClean("corpo" , 2,"Sucesso FireBase Repositorio 2 " ,2 ) ,
            ModelApiMvvmClean("corpo" , 3,"Sucesso FireBase Repositorio 3" ,2 )
        )

        listaDePostagensRecuperadaDoRepositorio.value = listaRecuperadaPeloRepositorio
    }
}