package net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.view;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import net.developermaster.kotlincanivetesuico.databinding.FragmentServicesForegroundSimplesBinding;
import net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.CustomApplication;
import net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.ServicesClassForeGround;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/view/FragmentServicesForeGroundSimples;", "Landroidx/fragment/app/Fragment;", "Landroid/content/ServiceConnection;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentServicesForegroundSimplesBinding;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentServicesForegroundSimplesBinding;", "customApplication", "Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/CustomApplication;", "serviceConnection", "servicesRecuperado", "Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onServiceConnected", "conectado1", "Landroid/content/ComponentName;", "conectado2", "Landroid/os/IBinder;", "onServiceDisconnected", "desconectado", "onViewCreated", "view", "app_debug"})
public final class FragmentServicesForeGroundSimples extends androidx.fragment.app.Fragment implements android.content.ServiceConnection {
    
    /**
     * Documennte a classe aqui
     */
    private android.content.ServiceConnection serviceConnection;
    private net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.ServicesClassForeGround servicesRecuperado;
    private net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.CustomApplication customApplication;
    @org.jetbrains.annotations.Nullable()
    private net.developermaster.kotlincanivetesuico.databinding.FragmentServicesForegroundSimplesBinding _binding;
    
    public FragmentServicesForeGroundSimples() {
        super();
    }
    
    @java.lang.Override()
    public void onServiceConnected(@org.jetbrains.annotations.Nullable()
    android.content.ComponentName conectado1, @org.jetbrains.annotations.Nullable()
    android.os.IBinder conectado2) {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable()
    android.content.ComponentName desconectado) {
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentServicesForegroundSimplesBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}