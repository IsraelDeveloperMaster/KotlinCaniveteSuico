package net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di

data class UsuariosComposeDummyApi(
    val limit: Int,
    val skip: Int,
    val total: Int,
    val users: List<User>
)