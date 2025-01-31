package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlinx.coroutines.Dispatchers;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomSimplesBinding;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase.BancoDeDadosRoomSimples;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0011H\u0016J\u001a\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/view/FragmentRoomSimples;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentRoomSimplesBinding;", "bancoDeDadosRoomSimples", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/dataBase/BancoDeDadosRoomSimples;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentRoomSimplesBinding;", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "interfaceDaoRoomSimples", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/dao/InterfaceDaoRoomSimples;", "codigo", "", "codigoXml", "funcaoAtualizar", "funcaoDeletar", "funcaoLimpaCampos", "funcaoListarId", "funcaoListarIdade", "funcaoListarNome", "funcaoListarTodos", "funcaoSalvar", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "onViewCreated", "view", "app_debug"})
public final class FragmentRoomSimples extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase.BancoDeDadosRoomSimples bancoDeDadosRoomSimples;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples interfaceDaoRoomSimples;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentRoomSimplesBinding _binding;
    
    public FragmentRoomSimples() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentRoomSimplesBinding getBinding() {
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
    
    private final void funcaoSalvar() {
    }
    
    private final void funcaoAtualizar() {
    }
    
    private final void funcaoDeletar() {
    }
    
    private final void funcaoListarId() {
    }
    
    private final void funcaoListarIdade() {
    }
    
    private final void funcaoListarNome() {
    }
    
    private final void funcaoListarTodos() {
    }
    
    private final void funcaoLimpaCampos() {
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
}