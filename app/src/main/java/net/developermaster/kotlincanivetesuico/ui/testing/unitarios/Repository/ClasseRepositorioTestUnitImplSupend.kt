package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository

import kotlinx.coroutines.delay
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario

class ClasseRepositorioTestUnitImplSupend : InterfaceRepositorioTestUnitSuspend {

    override suspend fun metodoLogarUsuarioRepositorioTestUnitSuspend (email: String, senha: String): Boolean {
        delay(2000)
        return true
    }

    override suspend fun metodoListarUsuarioRepositorioTestUnitSuspend (): List<ModelTestUnitario> {
        delay(2000)
        return listOf(
            ModelTestUnitario( "nome1", "email1" ),
            ModelTestUnitario( "nome2", "email2" ) )
    }

    override suspend fun metodoSalvarUsuarioRepositorioTestUnitSuspend(A: Int, B: Int): Int {
        delay(2000)
        return ( A + B)
    }
}