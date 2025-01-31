package net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote

import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.UsuariosComposeDummyApi
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceComposeDummyApi {

    @GET("users")
    suspend fun recuperarUsuariosDummyApi (): Response<UsuariosComposeDummyApi>
}