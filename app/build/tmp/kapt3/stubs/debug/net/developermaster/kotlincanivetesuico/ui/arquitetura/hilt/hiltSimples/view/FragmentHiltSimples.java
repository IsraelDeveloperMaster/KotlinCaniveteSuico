package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltSimplesBinding;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseSendoInjetada;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/view/FragmentHiltSimples;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentHiltSimplesBinding;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentHiltSimplesBinding;", "classeSendoInjetada", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/classes/ClasseSendoInjetada;", "getClasseSendoInjetada", "()Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/classes/ClasseSendoInjetada;", "setClasseSendoInjetada", "(Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltSimples/classes/ClasseSendoInjetada;)V", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "codigo", "", "codigoXml", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_debug"})
public final class FragmentHiltSimples extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @javax.inject.Inject
    public net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseSendoInjetada classeSendoInjetada;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentHiltSimplesBinding _binding;
    
    public FragmentHiltSimples() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseSendoInjetada getClasseSendoInjetada() {
        return null;
    }
    
    public final void setClasseSendoInjetada(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseSendoInjetada p0) {
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentHiltSimplesBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void codigo() {
    }
    
    private final void codigoXml() {
    }
}