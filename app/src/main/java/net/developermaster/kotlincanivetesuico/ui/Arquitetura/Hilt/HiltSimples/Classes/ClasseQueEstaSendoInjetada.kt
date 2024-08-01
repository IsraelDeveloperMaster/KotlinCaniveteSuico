package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Classes

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Interface.InterfaceHiltSimples
import javax.inject.Inject

class ClasseQueEstaSendoInjetada @Inject constructor(val interfaceHiltSimples: InterfaceHiltSimples) {//todo esta classe sera instanciado dentro da main activity

}