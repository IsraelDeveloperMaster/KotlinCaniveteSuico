package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.IUsuarioRepository


class UsuarioRepositoryFake : IUsuarioRepository {
    override suspend fun listar(): List<Usuario> {
        return listOf(
            Usuario(42, "j@gmail.com", "Jamilton", "M"),
            Usuario(23, "ana@gmail.com", "Ana", "F"),
            Usuario(45, "joao@gmail.com", "João", "M"),
        )
    }
}