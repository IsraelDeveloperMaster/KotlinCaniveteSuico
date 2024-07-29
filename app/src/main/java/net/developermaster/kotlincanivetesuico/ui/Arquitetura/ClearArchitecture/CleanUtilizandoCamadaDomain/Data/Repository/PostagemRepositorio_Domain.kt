package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Repository

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.API.Retrofit_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Model.paraPostagemDomainMap
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.ModelDomain.ClasseDeDadosPostagem_Model_Domain

class PostagemRepositorio_Domain : InterfaceRepositorio_Domain { //todo instanciando pelo construtor e baixando o acoplamento // injecao

    //todo metodo que recupera as postagens
    override suspend fun funcaoRecuperaPostagens(): List<ClasseDeDadosPostagem_Model_Domain> {

        try {

            //todo metodo da interface
            val retornaDasPostagens = Retrofit_Domain.recuperaPostagensApi_Domain().interfaceRecupetarPostagemJsonPlaceHolder_Domain()

            if ( retornaDasPostagens.isSuccessful && retornaDasPostagens.body() != null) {

                val listaDePostagensRespostaRetornada = retornaDasPostagens.body()

                val listaDePostagemMap = listaDePostagensRespostaRetornada?.map { retornoDasPostagensPorMap ->

                    //todo retorna uma lista tipo map que facilita a troca das informacoes

                    //todo retorno da classe de dados model domain
                    retornoDasPostagensPorMap.paraPostagemDomainMap()
                }

                if (listaDePostagemMap != null) {

                    return listaDePostagemMap
                }
            }

            //todo teste de erro
        } catch (erroPostagens: Exception) {

            erroPostagens.printStackTrace()
        }

        return emptyList()
    }
}