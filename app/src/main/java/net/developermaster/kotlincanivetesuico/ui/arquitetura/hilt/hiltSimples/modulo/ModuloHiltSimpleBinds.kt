package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.modulo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseImplementacaoHiltSimples
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.InterfaceHiltSimples

@Module
@InstallIn(FragmentComponent::class)

abstract class ModuloHiltSimpleBinds {

    @Binds//todo esta notacao serve para a utilizacao de interfaces
    abstract fun bindsInterfaceHiltSimples(classeImplementacaoHiltSimples: ClasseImplementacaoHiltSimples): InterfaceHiltSimples
}