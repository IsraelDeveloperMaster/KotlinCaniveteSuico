package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.API

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmClean
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceRetrofitApiJsonPlaceHolder_MvvmClean {

    @GET( "posts" )

    suspend fun interfaceRecupetarPostagemJsonPlaceHolder(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>
}