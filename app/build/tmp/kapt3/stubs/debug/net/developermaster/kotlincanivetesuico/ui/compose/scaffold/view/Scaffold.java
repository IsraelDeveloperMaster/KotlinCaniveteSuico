package net.developermaster.kotlincanivetesuico.ui.compose.scaffold.view;

import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposeImagem;
import net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposePostagem;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0003J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005H\u0003J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0003J \u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003J \u0010\u0015\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\tH\u0007J\u0012\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005H\u0003J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffold/view/Scaffold;", "Landroidx/activity/ComponentActivity;", "()V", "listaUsuariosPerfil", "", "Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffold/model/ModelComposeImagem;", "listaUsuariosPostagem", "Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffold/model/ModelComposePostagem;", "BottomBar", "", "Espaco", "Esqueleto", "Fab", "Home", "modifier", "Landroidx/compose/ui/Modifier;", "ItemUsuariosPerfil", "modelComposeImagem", "ItemUsuariosPostagem", "modelComposePostagem", "LazyColumnUsuariosPostagem", "LazyRowUsuariosPerfil", "MensagemToast", "messagem", "", "SnackBar", "TopBar", "itensDoCardView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class Scaffold extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposeImagem> listaUsuariosPerfil = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposePostagem> listaUsuariosPostagem = null;
    
    public Scaffold() {
        super(0);
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
    private final void itensDoCardView(net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposeImagem modelComposeImagem) {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyRowUsuariosPerfil(java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposeImagem> modelComposeImagem, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private final void ItemUsuariosPerfil(net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposeImagem modelComposeImagem) {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyColumnUsuariosPostagem(java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposePostagem> modelComposePostagem, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private final void ItemUsuariosPostagem(net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposePostagem modelComposePostagem) {
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