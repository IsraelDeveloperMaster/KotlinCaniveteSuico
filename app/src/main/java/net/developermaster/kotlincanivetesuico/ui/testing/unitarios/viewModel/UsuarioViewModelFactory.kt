package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain.UsuarioUseCase

class UsuarioViewModelFactory(
    private val usuarioUseCase: UsuarioUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return UsuarioViewModel( usuarioUseCase ) as T
    }
}