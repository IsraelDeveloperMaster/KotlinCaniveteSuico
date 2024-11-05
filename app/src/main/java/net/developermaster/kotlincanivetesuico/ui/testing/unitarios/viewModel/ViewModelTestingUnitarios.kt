package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import androidx.lifecycle.ViewModel
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.InterfaceRepositorioTestUnitSuspend
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario

class ViewModelTestingUnitarios(private val interfaceRepositorioTestUnitSuspend: InterfaceRepositorioTestUnitSuspend) : ViewModel() {

    suspend fun metodoLogarUsuarioViewModelFake(email: String, senha: String): Boolean {
        return interfaceRepositorioTestUnitSuspend.metodoLogarUsuarioRepositorioTestUnitSuspend( email, senha )
    }

    suspend fun metodoListarUsuarioViewModelFake(): List<ModelTestUnitario> {
        return interfaceRepositorioTestUnitSuspend.metodoListarUsuarioRepositorioTestUnitSuspend()
    }
}