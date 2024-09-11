package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.Repository

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.Usuario

interface IUsuarioRepository {
    suspend fun listar() : List<Usuario>
}