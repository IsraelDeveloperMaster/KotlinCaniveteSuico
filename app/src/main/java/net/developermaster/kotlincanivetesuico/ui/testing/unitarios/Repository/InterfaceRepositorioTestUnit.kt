package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario


interface InterfaceRepositorioTestUnit {

    fun metodoLogarUsuarioRepositorioTestUnit ( email: String, senha: String ) : Boolean
    fun metodoListarUsuarioRepositorioTestUnit (  ) : List<ModelTestUnitario>
}