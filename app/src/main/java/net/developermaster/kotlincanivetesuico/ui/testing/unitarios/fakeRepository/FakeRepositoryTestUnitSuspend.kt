package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.fakeRepository

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.InterfaceRepositorioTestUnitSuspend

class FakeRepositoryTestUnitSuspend : InterfaceRepositorioTestUnitSuspend {

    override suspend fun metodoLogarUsuarioRepositorioTestUnitSuspend( email: String, senha: String ): Boolean {

        return true
    }

    override suspend fun metodoListarUsuarioRepositorioTestUnitSuspend(): List<ModelTestUnitario> {

        return listOf(
            ModelTestUnitario("nome1", "email1"),
            ModelTestUnitario("nome2", "email2")
        )
    }

    override suspend fun metodoSalvarUsuarioRepositorioTestUnitSuspend(A: Int, B: Int): Int {
        TODO("Not yet implemented")
    }
}