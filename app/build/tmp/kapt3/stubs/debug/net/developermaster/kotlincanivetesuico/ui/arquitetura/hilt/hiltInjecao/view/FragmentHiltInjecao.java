package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltInjecaoBinding;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006&"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/view/FragmentHiltInjecao;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentHiltInjecaoBinding;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentHiltInjecaoBinding;", "carroComConstrutor", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroComConstrutor;", "getCarroComConstrutor", "()Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroComConstrutor;", "setCarroComConstrutor", "(Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroComConstrutor;)V", "carroSemConstrutor", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroSemConstrutor;", "getCarroSemConstrutor", "()Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroSemConstrutor;", "setCarroSemConstrutor", "(Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltInjecao/classes/CarroSemConstrutor;)V", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "codigo", "", "codigoXml", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_debug"})
public final class FragmentHiltInjecao extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @javax.inject.Inject
    public net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor carroComConstrutor;
    @javax.inject.Inject
    public net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor carroSemConstrutor;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentHiltInjecaoBinding _binding;
    
    public FragmentHiltInjecao() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor getCarroComConstrutor() {
        return null;
    }
    
    public final void setCarroComConstrutor(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor getCarroSemConstrutor() {
        return null;
    }
    
    public final void setCarroSemConstrutor(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor p0) {
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentHiltInjecaoBinding getBinding() {
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
    
    private final void codigo() {
    }
    
    private final void codigoXml() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}