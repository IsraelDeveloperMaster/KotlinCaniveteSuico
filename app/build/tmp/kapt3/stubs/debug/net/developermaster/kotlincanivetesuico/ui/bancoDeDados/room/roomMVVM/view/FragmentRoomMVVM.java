package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomMvvmBinding;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao.InterfaceDaoRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dataBase.BancoDeDadosRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010\'\u001a\u00020\u0018H\u0002J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010/\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\u001a\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/view/FragmentRoomMVVM;", "Landroidx/fragment/app/Fragment;", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/adapter/InterfaceRoomMVVM;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentRoomMvvmBinding;", "adapter", "LAdapterRoomMVVM;", "bancoDeDadosRoomMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/dataBase/BancoDeDadosRoomMVVM;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentRoomMvvmBinding;", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "interfaceDaoRoomMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/dao/InterfaceDaoRoomMVVM;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModelRoomMVVM", "LViewModelRoomMVVM;", "codigo", "", "codigoXml", "funcaoAdicionar", "funcaoAtualizar", "funcaoDeletar", "funcaoInterfaceRoomMvvmAdicionar", "bundle", "Landroid/os/Bundle;", "position", "", "funcaoInterfaceRoomMvvmDeleteNotyfy", "funcaoLimparCampos", "funcaoListarId", "funcaoListarIdade", "funcaoListarNome", "funcaoListarTodos", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onDestroyView", "onStart", "onViewCreated", "view", "app_debug"})
public final class FragmentRoomMVVM extends androidx.fragment.app.Fragment implements net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private AdapterRoomMVVM adapter;
    @org.jetbrains.annotations.Nullable
    private ViewModelRoomMVVM viewModelRoomMVVM;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dataBase.BancoDeDadosRoomMVVM bancoDeDadosRoomMVVM;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao.InterfaceDaoRoomMVVM interfaceDaoRoomMVVM;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentRoomMvvmBinding _binding;
    
    public FragmentRoomMVVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentRoomMvvmBinding getBinding() {
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
    
    private final void funcaoAdicionar() {
    }
    
    private final void funcaoAtualizar() {
    }
    
    private final void funcaoDeletar() {
    }
    
    private final void funcaoListarId() {
    }
    
    private final void funcaoListarNome() {
    }
    
    private final void funcaoListarIdade() {
    }
    
    private final void funcaoListarTodos() {
    }
    
    private final void funcaoLimparCampos() {
    }
    
    private final void codigo() {
    }
    
    private final void codigoXml() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void funcaoInterfaceRoomMvvmDeleteNotyfy(int position) {
    }
    
    @java.lang.Override
    public void funcaoInterfaceRoomMvvmAdicionar(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle, int position) {
    }
}