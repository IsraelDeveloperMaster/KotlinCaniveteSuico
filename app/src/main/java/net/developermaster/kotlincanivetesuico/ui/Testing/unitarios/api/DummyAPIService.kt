package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.api

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.ResultadoDummyAPI
import retrofit2.Response
import retrofit2.http.GET

interface DummyAPIService {

    @GET("users")
    suspend fun recupearListaUsuarios() : Response<ResultadoDummyAPI>

}