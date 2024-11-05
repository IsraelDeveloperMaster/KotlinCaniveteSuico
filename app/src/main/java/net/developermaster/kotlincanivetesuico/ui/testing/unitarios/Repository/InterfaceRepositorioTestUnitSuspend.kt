package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario


interface InterfaceRepositorioTestUnitSuspend {

    suspend fun metodoLogarUsuarioRepositorioTestUnitSuspend ( email: String, senha: String ) : Boolean

    suspend fun metodoListarUsuarioRepositorioTestUnitSuspend (  ) : List<ModelTestUnitario>

    suspend fun metodoSalvarUsuarioRepositorioTestUnitSuspend ( A: Int, B: Int): Int
}