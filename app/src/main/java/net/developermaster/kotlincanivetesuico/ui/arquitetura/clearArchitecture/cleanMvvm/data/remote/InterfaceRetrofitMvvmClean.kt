package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.remote

import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceRetrofitMvvmClean {

    @GET( "posts" )

    suspend fun interfaceRecupetarPostagemJsonPlaceHolder(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ModelApiMvvmClean>>
}