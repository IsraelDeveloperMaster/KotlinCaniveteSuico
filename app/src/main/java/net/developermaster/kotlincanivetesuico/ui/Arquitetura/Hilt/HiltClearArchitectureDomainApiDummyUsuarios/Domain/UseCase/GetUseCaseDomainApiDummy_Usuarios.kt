package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.UseCase

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Model_Data.ClasseDeDadosDataDomainApiDummy_Usuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.Repository.InterfaceRepositorioUsuarios
import javax.inject.Inject

class GetUseCaseDomainApiDummy_Usuarios @Inject constructor(
    private val interfacerepository_DomainApiDummy : InterfaceRepositorioUsuarios
) {

    suspend operator fun invoke(): List<ClasseDeDadosDataDomainApiDummy_Usuarios> {
        return try {

            //Regras de negócios
            interfacerepository_DomainApiDummy.recuperarUsuarios()

        } catch (erroRecuperarUsuarios: Exception) {
            erroRecuperarUsuarios.printStackTrace()
            emptyList()
        }
    }
}