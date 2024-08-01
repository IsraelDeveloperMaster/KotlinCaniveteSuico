package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Repository

import android.util.Log
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.API.InterfaceDomainApiDummy_Usuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Model_Data.ClasseDeDadosDataDomainApiDummy_Usuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.Repository.InterfaceRepositorioUsuarios
import javax.inject.Inject

class InterfaceRepositoryImplUsuarios @Inject constructor(private val interface_DomainApiDummy: InterfaceDomainApiDummy_Usuarios) :
    InterfaceRepositorioUsuarios {

    override suspend fun recuperarUsuarios(): List<ClasseDeDadosDataDomainApiDummy_Usuarios> {

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