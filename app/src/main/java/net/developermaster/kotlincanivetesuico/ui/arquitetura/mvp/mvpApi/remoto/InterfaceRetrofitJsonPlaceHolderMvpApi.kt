package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.remoto

import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.model.ModelJsonPlaceHolderMvpApi
import retrofit2.Response
import retrofit2.http.GET


interface InterfaceRetrofitJsonPlaceHolderMvpApi {

    @GET("posts")
    suspend fun interfaceRecupetarEnderecoApiJsonPlaceHolder(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/): Response<List<ModelJsonPlaceHolderMvpApi>>
}