package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.domain

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.Usuario
import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.Repository.IUsuarioRepository

class UsuarioUseCase(
     val iUsuarioRepository: IUsuarioRepository
) {

    suspend operator fun invoke() : List<Usuario> {//getListUserUseCase
        val listaUsuarios = iUsuarioRepository.listar()
        return listaUsuarios.filter { it.age >= 40 }
    }

}