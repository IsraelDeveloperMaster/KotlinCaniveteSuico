package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.remoto

import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmApi
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceRetrofitJsonPlaceHolderMvvmApi {

    @GET( "posts" )

    suspend fun interfaceRecupetarPostagemApiJsonPlaceHolder(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi>>
}