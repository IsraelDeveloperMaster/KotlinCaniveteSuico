package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.repository

import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain


interface RepositorioDataDomain {

    //todo metodo recupera os dados
    suspend fun funcaoRecuperaPostagens() : List<ModelPostagemModelDomain>
}