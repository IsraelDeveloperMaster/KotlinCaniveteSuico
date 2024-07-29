package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.API

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.Model.ClasseDeDadosDummyProdutos.ClasseDeDadosDummyProdutos
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceDomainApiDummy_Produtos {

    // getUsers()
    @GET("products")
    suspend fun recuperarUsuarios(): Response<ClasseDeDadosDummyProdutos>
}