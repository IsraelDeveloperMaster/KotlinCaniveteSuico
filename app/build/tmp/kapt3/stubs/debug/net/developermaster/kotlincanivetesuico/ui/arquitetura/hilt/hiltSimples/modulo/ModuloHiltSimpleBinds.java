package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.modulo;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseImplementacaoHiltSimples;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.InterfaceHiltSimples;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/modulo/ModuloHiltSimpleBinds;", "", "()V", "bindsInterfaceHiltSimples", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/classes/InterfaceHiltSimples;", "classeImplementacaoHiltSimples", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/classes/ClasseImplementacaoHiltSimples;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
public abstract class ModuloHiltSimpleBinds {
    
    public ModuloHiltSimpleBinds() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.InterfaceHiltSimples bindsInterfaceHiltSimples(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseImplementacaoHiltSimples classeImplementacaoHiltSimples);
}