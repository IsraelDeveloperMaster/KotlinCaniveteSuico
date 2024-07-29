package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Modulo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Classes.ClasseImplementacaoHiltSimples
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltSimples.Interface.InterfaceHiltSimples

@Module
@InstallIn(FragmentComponent::class)

abstract class ModuloHiltSimpleBinds_Abstract {

    @Binds//todo esta notacao serve para a utilizacao de interfaces
    abstract fun bindsInterfaceHiltSimples(classeImplementacaoHiltSimples: ClasseImplementacaoHiltSimples): InterfaceHiltSimples
}