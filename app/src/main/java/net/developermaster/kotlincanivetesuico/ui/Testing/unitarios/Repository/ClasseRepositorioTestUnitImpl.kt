package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.ModelTestUnitario


class ClasseRepositorioTestUnitImpl : InterfaceRepositorioTestUnit {

    override fun metodoLogarUsuarioRepositorioTestUnit(email: String, senha: String): Boolean {
        return true
    }

    override fun metodoListarUsuarioRepositorioTestUnit(): List<ModelTestUnitario> {
        return listOf(
            ModelTestUnitario( "nome1", "email1" ),
            ModelTestUnitario( "nome2", "email2" ) )
    }
}