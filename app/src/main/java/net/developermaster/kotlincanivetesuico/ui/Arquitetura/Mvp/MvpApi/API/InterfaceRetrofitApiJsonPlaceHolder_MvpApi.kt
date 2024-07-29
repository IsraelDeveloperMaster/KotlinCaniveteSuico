package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.API

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Model.ClasseDeDadosAPIJsonPlaceHolder_MvpApi
import retrofit2.Response
import retrofit2.http.GET


interface InterfaceRetrofitApiJsonPlaceHolder_MvpApi {

    @GET("posts")
    suspend fun interfaceRecupetarEnderecoApiJsonPlaceHolder(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi>>
}