package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.api.DummyAPIService
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario

class UsuarioRepositoryImpl(
     val dummyAPI: DummyAPIService
) : IUsuarioRepository {

    override suspend fun listar(): List<Usuario> {//5 segundos
        val resposta = dummyAPI.recupearListaUsuarios()
        if( resposta.isSuccessful && resposta.body() != null ){
            var listaUsuarios = resposta.body()?.users
            if( listaUsuarios != null ){
                return listaUsuarios
            }
        }
        return emptyList()
    }

}