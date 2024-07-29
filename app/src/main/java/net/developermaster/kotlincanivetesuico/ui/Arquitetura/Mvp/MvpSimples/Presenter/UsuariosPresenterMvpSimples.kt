package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpSimples.Presenter

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpSimples.Model.ClasseUsuariosMvpSimples

//todo alta dependencia /// alto acoplamentos     //RESOLVIDOS//

//todo agora tem um baixa dependencia /// e um baixo acoplamento
class UsuariosPresenterMvpSimples( private val interfacePresenterMvpSimples: InterfacePresenterMvpSimples ) {

    fun recuperaUsuarios() {

        val usuarios = ClasseUsuariosMvpSimples("Maria", 30)

        interfacePresenterMvpSimples.metodoExibirUsuariosQueEstaNaInterface(usuarios)
    }
}