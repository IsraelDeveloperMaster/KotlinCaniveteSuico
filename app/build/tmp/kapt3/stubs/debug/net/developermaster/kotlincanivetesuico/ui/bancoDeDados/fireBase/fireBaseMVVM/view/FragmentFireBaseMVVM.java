package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.view;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.storage.FirebaseStorage;
import com.squareup.picasso.Picasso;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseMvvmBinding;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter.InterfaceFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository.RepositorioFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel.ViewModelFireBaseMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u0019H\u0016J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\u0011\u0010*\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0011\u0010,\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u000201H\u0002J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010!H\u0016J\b\u0010;\u001a\u00020\u001dH\u0016J\b\u0010<\u001a\u00020\u001dH\u0016J\u001a\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010!H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/view/FragmentFireBaseMVVM;", "Landroidx/fragment/app/Fragment;", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/adapter/InterfaceFireBaseMVVM;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentFirebaseMvvmBinding;", "abrirGaleriaImagemAdaper", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "kotlin.jvm.PlatformType", "abrirGaleriaImagemPerfil", "adapter", "LAdapterFireBaseMVVM;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentFirebaseMvvmBinding;", "idImagemAdapter", "", "idImagemPerfil", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "repositorioFireBaseMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/repository/RepositorioFireBaseMVVM;", "resultadoRecyclerView", "", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/model/ModelFireBaseMVVM;", "viewModelFireBaseMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/viewModel/ViewModelFireBaseMVVM;", "funcaoAbrirGaleria", "", "funcaoAutenticar", "funcaoInterfaceFireBaseMvvmAdicionar", "bundle", "Landroid/os/Bundle;", "position", "", "funcaoInterfaceFireBaseMvvmDeleteNotyfy", "funcaoInterfaceFireBaseMvvmListarImagensNotyfy", "funcaoInterfaceFireBaseMvvmSalvarImagemAdapter", "modelFireBaseMVVM", "funcaoLimparCampos", "funcaoListarIdade", "funcaoListarImage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "funcaoListarImagemAdapter", "funcaoListarNome", "funcaoListarTodos", "funcaoSalvaFotoPerfil", "uri", "Landroid/net/Uri;", "funcaoSalvaImagemAdapter", "caminhoDaImagem", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onDestroyView", "onStart", "onViewCreated", "view", "app_debug"})
public final class FragmentFireBaseMVVM extends androidx.fragment.app.Fragment implements net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter.InterfaceFireBaseMVVM {
    @org.jetbrains.annotations.NotNull
    private java.lang.String idImagemAdapter = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String idImagemPerfil = "";
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private AdapterFireBaseMVVM adapter;
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel.ViewModelFireBaseMVVM viewModelFireBaseMVVM;
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository.RepositorioFireBaseMVVM repositorioFireBaseMVVM;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> abrirGaleriaImagemPerfil = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> abrirGaleriaImagemAdaper = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM> resultadoRecyclerView;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseMvvmBinding _binding;
    
    public FragmentFireBaseMVVM() {
        super();
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseMvvmBinding getBinding() {
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
    
    private final void funcaoListarTodos() {
    }
    
    private final java.lang.Object funcaoListarImagemAdapter(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void funcaoAbrirGaleria() {
    }
    
    private final void funcaoSalvaFotoPerfil(android.net.Uri uri) {
    }
    
    private final void funcaoSalvaImagemAdapter(android.net.Uri caminhoDaImagem) {
    }
    
    private final java.lang.Object funcaoListarImage(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void funcaoListarNome() {
    }
    
    private final void funcaoListarIdade() {
    }
    
    private final void funcaoLimparCampos() {
    }
    
    private final void funcaoAutenticar() {
    }
    
    @java.lang.Override
    public void funcaoInterfaceFireBaseMvvmListarImagensNotyfy() {
    }
    
    @java.lang.Override
    public void funcaoInterfaceFireBaseMvvmDeleteNotyfy(int position) {
    }
    
    @java.lang.Override
    public void funcaoInterfaceFireBaseMvvmSalvarImagemAdapter(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    @java.lang.Override
    public void funcaoInterfaceFireBaseMvvmAdicionar(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle, int position) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
}