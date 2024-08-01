package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Presenter

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Model.ClasseDeDadosAPIJsonPlaceHolder_MvpApi

interface InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi {

    //todo funcao para exibir os dados na tela
    fun exibirUsuariosApartirDaInterfacePresenter(lista: List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi>)

    //todo progress bar
    fun progressBar(carregando: Boolean)
}