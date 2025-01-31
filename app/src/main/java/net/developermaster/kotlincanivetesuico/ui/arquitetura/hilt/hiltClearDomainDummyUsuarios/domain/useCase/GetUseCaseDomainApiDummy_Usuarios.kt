package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.useCase

import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.Model.ModelDummyApiUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios
import javax.inject.Inject

class GetUseCaseDomainApiDummy_Usuarios @Inject constructor(
    private val interfacerepository_DomainApiDummy : RepositorioDummyUsuarios
) {

    suspend operator fun invoke(): List<ModelDummyApiUsuarios> {
        return try {

            //Regras de negócios
            interfacerepository_DomainApiDummy.recuperarUsuarios()

        } catch (erroRecuperarUsuarios: Exception) {
            erroRecuperarUsuarios.printStackTrace()
            emptyList()
        }
    }
}