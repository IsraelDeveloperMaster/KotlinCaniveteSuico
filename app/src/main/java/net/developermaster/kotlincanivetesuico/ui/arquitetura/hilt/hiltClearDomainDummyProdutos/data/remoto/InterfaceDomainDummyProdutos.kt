package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto

import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.model.ModelDummyProdutos
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceDomainDummyProdutos {

    // getUsers()
    @GET("products")
    suspend fun recuperarUsuarios(): Response<ModelDummyProdutos>
}