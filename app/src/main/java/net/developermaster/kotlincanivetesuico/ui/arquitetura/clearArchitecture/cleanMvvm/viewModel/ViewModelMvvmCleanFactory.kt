package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository.RepositorioDataMvvmClean

class ViewModelMvvmCleanFactory(private val interfaceRepositorio : RepositorioDataMvvmClean) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        //todo passa a classe viewmodelclean e trata o ciclo de vida do fragment
        return ViewModelMvvmClean(  interfaceRepositorio ) as T
    }
}