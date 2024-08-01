package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.Repository

import android.util.Log
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.API.InterfaceDomainApiDummyProdutos
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.Model.Product
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.RepositoryDomain.InterfaceRepositoryDomain
import javax.inject.Inject

class InterfaceRepositoryImpl @Inject constructor(
    private val interfacedomainapiJson : InterfaceDomainApiDummyProdutos
) : InterfaceRepositoryDomain {
    override suspend fun recuperarUsuarios(): List<Product> {

        try {

            val resposta = interfacedomainapiJson.recuperarUsuarios()
            if (resposta.isSuccessful && resposta.body() != null) {
                val resultadoAPIDTO = resposta.body()
                val listaUsuarios = resultadoAPIDTO?.products
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