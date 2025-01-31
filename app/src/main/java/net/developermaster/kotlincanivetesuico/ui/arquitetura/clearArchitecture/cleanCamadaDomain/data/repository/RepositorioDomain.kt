package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.repository

import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.Model.paraPostagemDomainMap
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.remoto.ClasseRetrofitDomain

class RepositorioDomain : RepositorioDataDomain { //todo instanciando pelo construtor e baixando o acoplamento // injecao

    //todo metodo que recupera as postagens
    override suspend fun funcaoRecuperaPostagens(): List<ModelPostagemModelDomain> {

        try {

            //todo metodo da interface
            val retornaDasPostagens = ClasseRetrofitDomain.recuperaPostagensApi_Domain().interfaceRecupetarPostagemJsonPlaceHolder_Domain()

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