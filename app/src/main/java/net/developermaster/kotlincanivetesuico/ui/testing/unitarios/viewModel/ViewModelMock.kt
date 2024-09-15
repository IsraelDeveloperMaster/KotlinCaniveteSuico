package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import androidx.lifecycle.ViewModel
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.InterfaceRepositorioTestUnitSuspend

class ViewModelMock (val interfaceRepositorioTestUnitSuspend: InterfaceRepositorioTestUnitSuspend) : ViewModel() {

    suspend fun metodoLogarUsuarioViewModelMockDadosFicticios(email: String, senha: String): Boolean {

        return interfaceRepositorioTestUnitSuspend.metodoLogarUsuarioRepositorioTestUnitSuspend( email, senha )
    }

    suspend fun metodoLogarUsuarioViewModelMockDadosReal( email: String, senha: String ): Boolean {

        return interfaceRepositorioTestUnitSuspend.metodoLogarUsuarioRepositorioTestUnitSuspend( email, senha )
    }

    suspend fun metodoListarUsuarioViewModelMockDadosFicticios(): List<ModelTestUnitario> {

        return interfaceRepositorioTestUnitSuspend.metodoListarUsuarioRepositorioTestUnitSuspend()
    }

    suspend fun metodoListarUsuarioViewModelMockDadosReal(): List<ModelTestUnitario> {

        return interfaceRepositorioTestUnitSuspend.metodoListarUsuarioRepositorioTestUnitSuspend()
    }

    suspend fun metodoSalverUsuarioViewModelMockDadosReal( A : Int, B : Int ) : Int {

        return interfaceRepositorioTestUnitSuspend.metodoSalvarUsuarioRepositorioTestUnitSuspend( A , B )
    }

}