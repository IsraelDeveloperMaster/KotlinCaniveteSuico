package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummy_Produtos.Domain.UseCase

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummy_Produtos.Data.Model.ClasseDeDadosDummyProdutos.Product
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummy_Produtos.Domain.Repository_Domain.InterfaceRepositoryDomainApiDummy_Produtos
import javax.inject.Inject

class GetUseCaseDomainApiDummy_Produtos @Inject constructor(
    private val interfaceRepositoryDomain_ApiJson: InterfaceRepositoryDomainApiDummy_Produtos
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