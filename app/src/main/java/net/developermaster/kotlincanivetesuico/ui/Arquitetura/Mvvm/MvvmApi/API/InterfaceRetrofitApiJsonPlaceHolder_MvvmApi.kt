package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvvm.MvvmApi.API

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvvm.MvvmApi.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmApi
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceRetrofitApiJsonPlaceHolder_MvvmApi {

    @GET( "posts" )

    suspend fun interfaceRecupetarPostagemApiJsonPlaceHolder(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi>>
}