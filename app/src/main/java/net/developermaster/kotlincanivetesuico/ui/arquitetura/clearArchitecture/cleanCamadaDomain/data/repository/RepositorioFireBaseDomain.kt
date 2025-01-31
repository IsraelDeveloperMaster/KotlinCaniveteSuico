package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.Model.ClasseDeDados_Domain_Resposta
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain

class RepositorioFireBaseDomain : RepositorioDataDomain {

    //todo recupera a lista
    private val listaDePostagensRecuperadaDoRepositorio = MutableLiveData<List<ClasseDeDados_Domain_Resposta>>()

    //todo metodo recupera os dados
    override suspend fun funcaoRecuperaPostagens(  ): List<ModelPostagemModelDomain> {

        //todo simula uma solicitacao por banco de dados ao inves de por api
        val listaRecuperadaPeloRepositorio = listOf(

            ClasseDeDados_Domain_Resposta("corpo" , 1,"Sucesso FireBase Repositorio 1" ,2 ) ,
            ClasseDeDados_Domain_Resposta("corpo" , 2,"Sucesso FireBase Repositorio 2 " ,2 ) ,
            ClasseDeDados_Domain_Resposta("corpo" , 3,"Sucesso FireBase Repositorio 3" ,2 )
        )

        listaDePostagensRecuperadaDoRepositorio.value = listaRecuperadaPeloRepositorio

        return emptyList()
    }
}