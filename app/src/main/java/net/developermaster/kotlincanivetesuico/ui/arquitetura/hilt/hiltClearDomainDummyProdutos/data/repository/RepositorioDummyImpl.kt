package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.repository

import android.util.Log
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto.InterfaceDomainDummyProdutos
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.model.Product
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain
import javax.inject.Inject

class RepositorioDummyImpl @Inject constructor(
    private val interfacedomainapiJson : InterfaceDomainDummyProdutos
) : RepositorioDummyDomain {
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