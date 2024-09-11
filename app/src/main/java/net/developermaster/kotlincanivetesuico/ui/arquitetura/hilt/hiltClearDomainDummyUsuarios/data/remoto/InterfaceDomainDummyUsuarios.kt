package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto

import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.Model.ResultadoDummyUsuarios
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceDomainDummyUsuarios {

    // getUsers()
    @GET("users")
    suspend fun recuperarUsuarios(): Response<ResultadoDummyUsuarios>
}