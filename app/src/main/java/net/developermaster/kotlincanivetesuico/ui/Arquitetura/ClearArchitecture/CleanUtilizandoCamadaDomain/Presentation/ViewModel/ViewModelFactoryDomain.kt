package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Presentation.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.UserCase.PostagemUseCase

class ViewModelFactoryDomain (private val postagemUseCase: PostagemUseCase) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        //todo passa a classe viewmodelclean e trata o ciclo de vida do fragment
        return ViewModelDomain(  postagemUseCase ) as T
    }
}