package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.UserCase

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Repository.InterfaceRepositorio_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.ModelDomain.ClasseDeDadosPostagem_Model_Domain

//todo exemplos de nomes UseCase pode comecar pos Get ou Set
class PostagemUseCase(private val repositorioDomain : InterfaceRepositorio_Domain) { //todo reconhece a classe postagem domain

               /* todo Get ou todo Set */
//    suspend fun recuperarPostagensUseCase(  ) : List<ClasseDeDadosPostagem_Model_Domain>{//todo sem invoke
    suspend operator fun invoke(  ) : List<ClasseDeDadosPostagem_Model_Domain>{//todo com invoke

        try {

            //todo exemplos de recuperacao de dados com , fotos
            //todo exemplos de recuperacao de dados com , listas
            //todo exemplos de recuperacao de dados com , postagem
            //todo exemplos de recuperacao de dados com , album
            //todo exemplos de recuperacao de dados com , tags

            return repositorioDomain.funcaoRecuperaPostagens(  )//todo com invoke

        } catch (erroPostagensusecase: Exception) {

            erroPostagensusecase.printStackTrace()
        }

        return  emptyList()
    }
}