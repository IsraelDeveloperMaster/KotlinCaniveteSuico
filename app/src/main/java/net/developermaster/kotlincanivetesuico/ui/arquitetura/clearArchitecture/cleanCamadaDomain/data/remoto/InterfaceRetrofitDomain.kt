package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.remoto

import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.Model.ClasseDeDados_Domain_Resposta
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceRetrofitDomain {

    @GET( "posts" )

    suspend fun interfaceRecupetarPostagemJsonPlaceHolder_Domain(  /*@Path( "posts" ) dados_recebido_pelo_caixa_de_texto: String*/ ): Response<List<ClasseDeDados_Domain_Resposta>>
}