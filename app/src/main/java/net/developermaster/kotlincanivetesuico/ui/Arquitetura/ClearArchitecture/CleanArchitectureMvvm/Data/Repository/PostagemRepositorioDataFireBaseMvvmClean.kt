package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmClean

class PostagemRepositorioDataFireBaseMvvmClean : InterfaceRepositorioData_MvvmClean {

    //todo recupera a lista
    override val listaDePostagensRecuperadaDoRepositorio = MutableLiveData<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>()

    //todo metodo recupera os dados
    override suspend fun funcaoRecuperaPostagens() {

        //todo simula uma solicitacao por banco de dados ao inves de por api
        val listaRecuperadaPeloRepositorio = listOf(

            ClasseDeDadosAPIJsonPlaceHolder_MvvmClean("corpo" , 1,"Sucesso FireBase Repositorio 1" ,2 ) ,
            ClasseDeDadosAPIJsonPlaceHolder_MvvmClean("corpo" , 2,"Sucesso FireBase Repositorio 2 " ,2 ) ,
            ClasseDeDadosAPIJsonPlaceHolder_MvvmClean("corpo" , 3,"Sucesso FireBase Repositorio 3" ,2 )
        )

        listaDePostagensRecuperadaDoRepositorio.value = listaRecuperadaPeloRepositorio
    }
}