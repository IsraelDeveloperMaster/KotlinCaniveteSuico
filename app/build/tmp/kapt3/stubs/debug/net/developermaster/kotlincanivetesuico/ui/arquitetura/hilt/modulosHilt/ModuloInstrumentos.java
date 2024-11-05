package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Banda;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento;
import javax.inject.Named;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/modulosHilt/ModuloInstrumentos;", "", "()V", "proverBanda", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/Banda;", "violao", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/InterfaceInstrumento;", "bateria", "guitarra", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
public final class ModuloInstrumentos {
    @org.jetbrains.annotations.NotNull
    public static final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt.ModuloInstrumentos INSTANCE = null;
    
    private ModuloInstrumentos() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Banda proverBanda(@javax.inject.Named(value = "violao")
    @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento violao, @javax.inject.Named(value = "bateria")
    @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento bateria, @javax.inject.Named(value = "guitarra")
    @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento guitarra) {
        return null;
    }
}