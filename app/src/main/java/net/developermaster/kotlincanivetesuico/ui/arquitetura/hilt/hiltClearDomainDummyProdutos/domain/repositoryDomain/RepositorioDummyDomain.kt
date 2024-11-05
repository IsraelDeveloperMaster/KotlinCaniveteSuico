package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain

import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.model.Product

interface RepositorioDummyDomain {
    suspend fun recuperarUsuarios() : List<Product>
}