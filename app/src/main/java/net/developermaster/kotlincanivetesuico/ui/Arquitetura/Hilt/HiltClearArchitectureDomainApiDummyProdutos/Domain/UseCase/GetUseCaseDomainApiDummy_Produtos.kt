package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.UseCase

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.RepositoryDomain.InterfaceRepositoryDomain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.Model.Product
import javax.inject.Inject

class GetUseCaseDomainApiDummy_Produtos @Inject constructor(
    private val interfaceRepositoryDomain_ApiJson: InterfaceRepositoryDomain
) {
    suspend operator fun invoke(): List<Product> {
        return try {

            //Regras de negócios
            interfaceRepositoryDomain_ApiJson.recuperarUsuarios()

        } catch (erroRecuperarUsuarios: Exception) {
            erroRecuperarUsuarios.printStackTrace()
            emptyList()
        }
    }
}