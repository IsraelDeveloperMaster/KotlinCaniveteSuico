package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.IUsuarioRepository

class UsuarioUseCase(
     val iUsuarioRepository: IUsuarioRepository
) {

    suspend operator fun invoke() : List<Usuario> {//getListUserUseCase
        val listaUsuarios = iUsuarioRepository.listar()
        return listaUsuarios.filter { it.age >= 40 }
    }

}