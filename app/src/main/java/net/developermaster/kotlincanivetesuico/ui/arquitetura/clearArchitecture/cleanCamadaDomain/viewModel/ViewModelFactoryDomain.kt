package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase

class ViewModelFactoryDomain (private val postagemUseCase: PostagemUseCase) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        //todo passa a classe viewmodelclean e trata o ciclo de vida do fragment
        return ViewModelDomain(  postagemUseCase ) as T
    }
}