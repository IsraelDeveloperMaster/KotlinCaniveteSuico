package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.UseCase

import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.model.Product
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain
import javax.inject.Inject

class GetUseCaseDomainDummyProdutos @Inject constructor(
    private val repositorioDummyDomain_ApiJson: RepositorioDummyDomain
) {
    suspend operator fun invoke(): List<Product> {
        return try {

            //Regras de negócios
            repositorioDummyDomain_ApiJson.recuperarUsuarios()

        } catch (erroRecuperarUsuarios: Exception) {
            erroRecuperarUsuarios.printStackTrace()
            emptyList()
        }
    }
}