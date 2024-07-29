package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Presentation.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Repository.InterfaceRepositorioData_MvvmClean

class ViewModelComMvvmCleanFactory(private val interfaceRepositorio : InterfaceRepositorioData_MvvmClean) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        //todo passa a classe viewmodelclean e trata o ciclo de vida do fragment
        return ViewModelComMvvmClean(  interfaceRepositorio ) as T
    }
}