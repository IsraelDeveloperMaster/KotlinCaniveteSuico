package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.API

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.Model.ClasseDadosDummyProdutos
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceDomainApiDummyProdutos {

    // getUsers()
    @GET("products")
    suspend fun recuperarUsuarios(): Response<ClasseDadosDummyProdutos>
}