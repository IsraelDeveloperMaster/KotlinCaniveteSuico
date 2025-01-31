package net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.view;

import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import dagger.hilt.android.AndroidEntryPoint;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User;
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.viewmodel.ViewModelComposeMvvm;
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposeImagemMVVM;
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposePostagemMVVM;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0003J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0003J \u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003J \u0010\u001c\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u000fH\u0007J\u0012\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u000fH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006&"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffoldMVVM/view/ScaffoldMVVM;", "Landroidx/activity/ComponentActivity;", "()V", "listaUsuariosPerfil", "", "Lnet/developermaster/kotlincanivetesuico/ui/compose/View/ScaffoldMVVM/data/model/ModelComposeImagemMVVM;", "listaUsuariosPostagem", "Lnet/developermaster/kotlincanivetesuico/ui/compose/View/ScaffoldMVVM/data/model/ModelComposePostagemMVVM;", "viewModelComposeMvvm", "Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffoldMVVM/viewmodel/ViewModelComposeMvvm;", "getViewModelComposeMvvm", "()Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffoldMVVM/viewmodel/ViewModelComposeMvvm;", "viewModelComposeMvvm$delegate", "Lkotlin/Lazy;", "BottomBar", "", "Espaco", "Esqueleto", "Fab", "Home", "modifier", "Landroidx/compose/ui/Modifier;", "ItemUsuariosPerfil", "user", "Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffoldMVVM/di/User;", "ItemUsuariosPostagem", "modelComposePostagemMVVM", "LazyColumnUsuariosPostagem", "LazyRowUsuariosPerfil", "MensagemToast", "messagem", "", "SnackBar", "TopBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "app_debug"})
public final class ScaffoldMVVM extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposeImagemMVVM> listaUsuariosPerfil = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposePostagemMVVM> listaUsuariosPostagem = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModelComposeMvvm$delegate = null;
    
    public ScaffoldMVVM() {
        super(0);
    }
    
    private final net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.viewmodel.ViewModelComposeMvvm getViewModelComposeMvvm() {
        return null;
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.compose.runtime.Composable
    public final void Home(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public final void Esqueleto() {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyRowUsuariosPerfil(java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User> user, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private final void ItemUsuariosPerfil(net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User user) {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyColumnUsuariosPostagem(java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposePostagemMVVM> modelComposePostagemMVVM, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private final void ItemUsuariosPostagem(net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposePostagemMVVM modelComposePostagemMVVM) {
    }
    
    public final void MensagemToast(@org.jetbrains.annotations.NotNull
    java.lang.String messagem) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public final void TopBar(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public final void BottomBar() {
    }
    
    @androidx.compose.runtime.Composable
    public final void Fab() {
    }
    
    @androidx.compose.runtime.Composable
    public final void SnackBar() {
    }
    
    @androidx.compose.runtime.Composable
    private final void Espaco() {
    }
}