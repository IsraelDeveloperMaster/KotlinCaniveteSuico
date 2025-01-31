package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.repository

import android.util.Log
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto.InterfaceDomainDummyUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.Model.ModelDummyApiUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios
import javax.inject.Inject

class RepositoryImplDummyUsuarios @Inject constructor(private val interface_DomainApiDummy: InterfaceDomainDummyUsuarios) :
    RepositorioDummyUsuarios {

    override suspend fun recuperarUsuarios(): List<ModelDummyApiUsuarios> {

        try {

            val resposta = interface_DomainApiDummy.recuperarUsuarios()
            if (resposta.isSuccessful && resposta.body() != null) {
                val resultadoAPIDTO = resposta.body()
                val listaUsuarios = resultadoAPIDTO?.users
                if (listaUsuarios != null) {
                    /*val usuarios = listaUsuarios.map {
                        usuarioDTO.toUsuario()
                    }*/
                    return listaUsuarios.map { it }
                }
            } else {
                Log.i("lista_usuarios", resposta.message())
            }

        } catch (erroRecuperarUsuarios: Exception) {
            erroRecuperarUsuarios.printStackTrace()
        }
        return emptyList()
    }
}