package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase

import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.repository.RepositorioDataDomain
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain

//todo exemplos de nomes UseCase pode comecar por Get ou Set
class PostagemUseCase(private val repositorioDataDomain : RepositorioDataDomain) { //todo reconhece a classe postagem domain

               /* todo Get ou todo Set */
//    suspend fun recuperarPostagensUseCase(  ) : List<ModelPostagemModelDomain>{//todo sem invoke

    suspend operator fun invoke(  ) : List<ModelPostagemModelDomain>{//todo com invoke

        try {

            //todo exemplos de recuperacao de dados com , fotos
            //todo exemplos de recuperacao de dados com , listas
            //todo exemplos de recuperacao de dados com , postagem
            //todo exemplos de recuperacao de dados com , album
            //todo exemplos de recuperacao de dados com , tags
            //todo exemplos de recuperacao de dados com , comentarios

            return repositorioDataDomain.funcaoRecuperaPostagens(  )//todo com invoke

        } catch (erroPostagensusecase: Exception) {

            erroPostagensusecase.printStackTrace()
        }

        return  emptyList()
    }
}