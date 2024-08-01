package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Repository

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.ModelDomain.ClasseDeDadosPostagem_Model_Domain


interface InterfaceRepositorio_Domain {

    //tod o metodo recupera os dados
    suspend fun funcaoRecuperaPostagens() : List<ClasseDeDadosPostagem_Model_Domain>
}