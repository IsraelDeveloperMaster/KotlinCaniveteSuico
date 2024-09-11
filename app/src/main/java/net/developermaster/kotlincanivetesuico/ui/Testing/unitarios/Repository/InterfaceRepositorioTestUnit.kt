package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.ModelTestUnitario


interface InterfaceRepositorioTestUnit {

    fun metodoLogarUsuarioRepositorioTestUnit ( email: String, senha: String ) : Boolean
    fun metodoListarUsuarioRepositorioTestUnit (  ) : List<ModelTestUnitario>
}