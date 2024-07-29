package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummy_Usuarios.Domain.UseCase

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummy_Usuarios.Data.Model_Data.ClasseDeDadosDataApiDummy_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummy_Usuarios.Domain.Repository.InterfaceRepositoryDomainApiDummy_Usuarios
import javax.inject.Inject

class GetUseCaseDomainApiDummy_Usuarios @Inject constructor(
    private val interfacerepository_DomainApiDummy : InterfaceRepositoryDomainApiDummy_Usuarios
) {

    suspend operator fun invoke(): List<ClasseDeDadosDataApiDummy_Domain> {
        return try {

            //Regras de negócios
            interfacerepository_DomainApiDummy.recuperarUsuarios()

        } catch (erroRecuperarUsuarios: Exception) {
            erroRecuperarUsuarios.printStackTrace()
            emptyList()
        }
    }
}