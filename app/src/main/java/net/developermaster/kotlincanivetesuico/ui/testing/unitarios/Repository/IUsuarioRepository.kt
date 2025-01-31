package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario

interface IUsuarioRepository {
    suspend fun listar() : List<Usuario>
}