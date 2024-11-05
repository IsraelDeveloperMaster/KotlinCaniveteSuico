package net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository

import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User


interface RepositoryComposeMvvm {

    suspend fun recuperarUsuariosDummyApi(): List<User>

}