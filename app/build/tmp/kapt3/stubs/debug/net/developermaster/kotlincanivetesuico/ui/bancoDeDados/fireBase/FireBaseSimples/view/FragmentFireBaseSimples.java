package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.FireBaseSimples.view;

import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.squareup.picasso.Picasso;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseSimplesBinding;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.FireBaseSimples.model.ModelFireBaseSimples;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u00020\u0012H\u0016J\u001a\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/FireBaseSimples/view/FragmentFireBaseSimples;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentFirebaseSimplesBinding;", "abrirGaleria", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "kotlin.jvm.PlatformType", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentFirebaseSimplesBinding;", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "listaItens", "", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/FireBaseSimples/model/ModelFireBaseSimples;", "codigo", "", "codigoXml", "deletarItem", "itemQueSeraDeletado", "", "position", "", "funcaoAbrirGaleria", "funcaoAlerDialog", "id", "posicaoListView", "funcaoAtualizar", "funcaoAutentica", "funcaoDeletar", "funcaoLimpaCampos", "funcaoListarId", "funcaoListarIdade", "funcaoListarImage", "funcaoListarNome", "funcaoListarTodos", "funcaoQueCopiaObjetoId", "funcaoSalva", "funcaoSalvaFotoFireBase", "uri", "Landroid/net/Uri;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "onViewCreated", "view", "app_debug"})
public final class FragmentFireBaseSimples extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> abrirGaleria = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.FireBaseSimples.model.ModelFireBaseSimples> listaItens;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseSimplesBinding _binding;
    
    public FragmentFireBaseSimples() {
        super();
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseSimplesBinding getBinding() {
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
    
    private final void funcaoAbrirGaleria() {
    }
    
    private final void funcaoSalvaFotoFireBase(android.net.Uri uri) {
    }
    
    private final void funcaoListarImage() {
    }
    
    private final void funcaoAutentica() {
    }
    
    private final void funcaoSalva() {
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
    
    private final void funcaoLimpaCampos() {
    }
    
    private final void funcaoListarTodos() {
    }
    
    private final void funcaoQueCopiaObjetoId() {
    }
    
    private final void deletarItem(java.lang.String itemQueSeraDeletado, int position) {
    }
    
    private final void funcaoAlerDialog(java.lang.String id, int posicaoListView) {
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