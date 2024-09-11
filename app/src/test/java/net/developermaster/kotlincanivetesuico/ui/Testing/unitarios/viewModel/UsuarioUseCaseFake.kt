package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.viewModel

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.Usuario


class UsuarioUseCaseFake {

    suspend operator fun invoke() : List<Usuario> {//getListUserUseCase
        return listOf(
            Usuario(42, "j@gmail.com", "Jamilton", "M"),
            Usuario(23, "ana@gmail.com", "Ana", "F"),
            Usuario(45, "joao@gmail.com", "João", "M"),
        )
    }

}