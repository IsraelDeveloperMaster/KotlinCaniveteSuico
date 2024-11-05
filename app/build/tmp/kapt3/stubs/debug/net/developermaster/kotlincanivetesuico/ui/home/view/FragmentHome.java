package net.developermaster.kotlincanivetesuico.ui.home.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentHomeBinding;
import net.developermaster.kotlincanivetesuico.ui.home.adapter.InterfaceHome;
import net.developermaster.kotlincanivetesuico.ui.home.model.ModelHome;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u0017H\u0016J\u001a\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/home/view/FragmentHome;", "Landroidx/fragment/app/Fragment;", "Lnet/developermaster/kotlincanivetesuico/ui/home/adapter/InterfaceHome;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentHomeBinding;", "adapter", "LAdapterHome;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentHomeBinding;", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "modelHome", "", "Lnet/developermaster/kotlincanivetesuico/ui/home/model/ModelHome;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchView", "Landroid/widget/SearchView;", "ARQUITETURA", "", "CLEAN", "COMPOSE", "DATABINDING", "FIREBASE", "FLOW", "FRAGMENT", "GOOGLEMAP", "HILT", "LIVEDATA", "MVC", "MVP", "MVVM", "ROOM", "SEARCHVIEW", "SERVICESBACKGROUND", "TEST", "VIEWMODEL", "codigo", "codigoXml", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_debug"})
public final class FragmentHome extends androidx.fragment.app.Fragment implements net.developermaster.kotlincanivetesuico.ui.home.adapter.InterfaceHome {
    private android.widget.SearchView searchView;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private AdapterHome adapter;
    private java.util.List<net.developermaster.kotlincanivetesuico.ui.home.model.ModelHome> modelHome;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentHomeBinding _binding;
    
    public FragmentHome() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentHomeBinding getBinding() {
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
    public void COMPOSE() {
    }
    
    @java.lang.Override
    public void FIREBASE() {
    }
    
    @java.lang.Override
    public void ROOM() {
    }
    
    @java.lang.Override
    public void SEARCHVIEW() {
    }
    
    @java.lang.Override
    public void FRAGMENT() {
    }
    
    @java.lang.Override
    public void ARQUITETURA() {
    }
    
    @java.lang.Override
    public void MVC() {
    }
    
    @java.lang.Override
    public void MVP() {
    }
    
    @java.lang.Override
    public void VIEWMODEL() {
    }
    
    @java.lang.Override
    public void LIVEDATA() {
    }
    
    @java.lang.Override
    public void DATABINDING() {
    }
    
    @java.lang.Override
    public void MVVM() {
    }
    
    @java.lang.Override
    public void CLEAN() {
    }
    
    @java.lang.Override
    public void HILT() {
    }
    
    @java.lang.Override
    public void TEST() {
    }
    
    @java.lang.Override
    public void GOOGLEMAP() {
    }
    
    @java.lang.Override
    public void SERVICESBACKGROUND() {
    }
    
    @java.lang.Override
    public void FLOW() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void codigo() {
    }
    
    private final void codigoXml() {
    }
}