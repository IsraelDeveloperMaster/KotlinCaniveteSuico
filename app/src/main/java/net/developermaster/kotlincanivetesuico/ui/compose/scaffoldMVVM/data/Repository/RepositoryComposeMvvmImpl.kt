package net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository

import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote.InterfaceComposeDummyApi
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User
import javax.inject.Inject

class RepositoryComposeMvvmImpl @Inject constructor( private val interfaceComposeDummyApi: InterfaceComposeDummyApi ) : RepositoryComposeMvvm {

    override suspend fun recuperarUsuariosDummyApi(): List<User> {

        try {

            //todo fazer a requisicao para a api dummy
            val respostaRequisicaoDummyApi = interfaceComposeDummyApi.recuperarUsuariosDummyApi()

            if ( respostaRequisicaoDummyApi.isSuccessful && respostaRequisicaoDummyApi.body() != null ) {

                val listaDeUsuariosRetornada = respostaRequisicaoDummyApi.body()!!.users

                return listaDeUsuariosRetornada
            }

        } catch ( ErroRequisicaoDummyApi : Exception )  {

                ErroRequisicaoDummyApi.printStackTrace()
        }

        return emptyList()
    }
}

