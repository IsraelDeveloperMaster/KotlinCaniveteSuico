package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpSimples.presenter

import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpSimples.model.ModelMvpSimples

//todo alta dependencia /// alto acoplamentos     //RESOLVIDOS//

//todo agora tem um baixa dependencia /// e um baixo acoplamento
class UsuariosPresenterMvpSimples( private val interfacePresenterMvpSimples: InterfacePresenterMvpSimples ) {

    fun recuperaUsuarios() {

        val usuarios = ModelMvpSimples("Maria", 30)

        interfacePresenterMvpSimples.metodoExibirUsuariosQueEstaNaInterface(usuarios)
    }
}