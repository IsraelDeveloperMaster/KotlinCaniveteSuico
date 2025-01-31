package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/Musico;", "", "interfaceInstrumento", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/InterfaceInstrumento;", "context", "Landroid/content/Context;", "(Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltDependenciasNomeadas/classes/InterfaceInstrumento;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mensagemToast", "", "mensagem", "", "tocar", "app_debug"})
public final class Musico {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento interfaceInstrumento = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public Musico(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento interfaceInstrumento, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String tocar() {
        return null;
    }
    
    public final void mensagemToast(@org.jetbrains.annotations.NotNull
    java.lang.String mensagem) {
    }
}