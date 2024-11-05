package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Bateria;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Guitarra;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Musico;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Violao;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.InterfaceMotor;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.MotorHyblido;
import javax.inject.Named;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007J\u001c\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007\u00a8\u0006\u0013"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/modulosHilt/ModuloCarro;", "", "()V", "proveBateria", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/InterfaceInstrumento;", "proveCarroComConstrutor", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroComConstrutor;", "interfaceMotor", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/InterfaceMotor;", "context", "Landroid/content/Context;", "proveCarroSemConstrutor", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroSemConstrutor;", "proveGuitarra", "proveMotorHybrido", "proveMusico", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/Musico;", "interfaceInstrumento", "proveViolao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
public final class ModuloCarro {
    @org.jetbrains.annotations.NotNull
    public static final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt.ModuloCarro INSTANCE = null;
    
    private ModuloCarro() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor proveCarroSemConstrutor() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor proveCarroComConstrutor(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.InterfaceMotor interfaceMotor, @dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.InterfaceMotor proveMotorHybrido() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Musico proveMusico(@javax.inject.Named(value = "violao")
    @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento interfaceInstrumento, @dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Named(value = "violao")
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento proveViolao() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Named(value = "bateria")
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento proveBateria() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Named(value = "guitarra")
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento proveGuitarra() {
        return null;
    }
}