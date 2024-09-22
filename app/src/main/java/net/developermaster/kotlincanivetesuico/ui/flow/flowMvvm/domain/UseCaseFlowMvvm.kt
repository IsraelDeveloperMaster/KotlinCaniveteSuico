package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.domain

import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository.RepositoryFlowMvvm

class UseCaseFlowMvvm {

    val repositoryFlowMvvm = RepositoryFlowMvvm()

    operator fun invoke()  {
        repositoryFlowMvvm.listar
   }
}