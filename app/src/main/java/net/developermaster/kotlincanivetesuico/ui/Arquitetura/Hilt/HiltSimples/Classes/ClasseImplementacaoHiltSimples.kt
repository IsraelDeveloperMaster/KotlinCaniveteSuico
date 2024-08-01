package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Classes

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Interface.InterfaceHiltSimples
import javax.inject.Inject

class ClasseImplementacaoHiltSimples @Inject constructor() : InterfaceHiltSimples {//todo esta classe é somente para implementar o metodo da interface

    override fun metodoDaInterfaceHiltSimples(): String {

        var texto = "Classe injetada no construtor por @Binds com Hilt"

        return texto
    }
}