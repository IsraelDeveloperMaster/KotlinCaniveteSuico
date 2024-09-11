package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.presenter

import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.model.ModelJsonPlaceHolderMvpApi

interface InterfacePresenterPostagemJsonPlaceHolderMvpApi {

    //todo funcao para exibir os dados na tela
    fun exibirUsuariosApartirDaInterfacePresenter(lista: List<ModelJsonPlaceHolderMvpApi>)

    //todo progress bar
    fun progressBar(carregando: Boolean)
}