package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.API

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Model_Data.ResultadoClasseDeDadosDomainApiDummy_Usuarios
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceDomainApiDummy_Usuarios {

    // getUsers()
    @GET("users")
    suspend fun recuperarUsuarios(): Response<ResultadoClasseDeDadosDomainApiDummy_Usuarios>
}