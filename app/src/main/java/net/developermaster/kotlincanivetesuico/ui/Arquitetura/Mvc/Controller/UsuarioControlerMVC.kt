package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvc.Controller

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvc.Model.UsuarioApiMVC
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvc.View.FragmentMVC


//todo classe que retorna as informacoes para a main
class UsuarioControlerMVC( val fragmentMvc: FragmentMVC) { //todo alto acoplamento ****** alta dependencia de FragmentMVC

    //todo instancia usuario api
    val usuarioApiMVC = UsuarioApiMVC()

    fun recuperar_usuarios() {

        //todo regra de negocio
        val lista_de_usuarios_recuperada = usuarioApiMVC.recuperar_usuarios()

        //todo envia os parametros para o fragment mvc
        fragmentMvc.funcaoQueEstaDentroDoFragmentoMVC(lista_de_usuarios_recuperada)
    }
}

