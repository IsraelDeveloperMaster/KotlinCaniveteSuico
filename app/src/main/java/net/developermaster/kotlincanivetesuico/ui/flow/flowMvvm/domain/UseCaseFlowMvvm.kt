package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.domain

import kotlinx.coroutines.flow.Flow
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository.RepositoryFlowMvvm

class UseCaseFlowMvvm {

    private val repositoryFlowMvvm = RepositoryFlowMvvm()

    operator fun invoke() : Flow<String> {

        return repositoryFlowMvvm.frases
    }
}