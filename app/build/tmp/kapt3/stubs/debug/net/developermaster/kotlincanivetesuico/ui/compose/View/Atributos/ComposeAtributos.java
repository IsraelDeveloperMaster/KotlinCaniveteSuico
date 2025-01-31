package net.developermaster.kotlincanivetesuico.ui.compose.View.Atributos;

import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.style.TextAlign;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.ui.compose.model.ModelComposeGeral;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0003J\b\u0010\n\u001a\u00020\tH\u0003J\b\u0010\u000b\u001a\u00020\tH\u0003J\b\u0010\f\u001a\u00020\tH\u0003J\b\u0010\r\u001a\u00020\tH\u0003J\b\u0010\u000e\u001a\u00020\tH\u0003J\b\u0010\u000f\u001a\u00020\tH\u0003J\b\u0010\u0010\u001a\u00020\tH\u0003J\b\u0010\u0011\u001a\u00020\tH\u0003J\b\u0010\u0012\u001a\u00020\tH\u0003J\b\u0010\u0013\u001a\u00020\tH\u0003J\b\u0010\u0014\u001a\u00020\tH\u0003J\b\u0010\u0015\u001a\u00020\tH\u0003J\b\u0010\u0016\u001a\u00020\tH\u0003J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0003J\b\u0010\u0019\u001a\u00020\tH\u0003J\b\u0010\u001a\u001a\u00020\tH\u0003J\b\u0010\u001b\u001a\u00020\tH\u0003J\b\u0010\u001c\u001a\u00020\tH\u0003J\b\u0010\u001d\u001a\u00020\tH\u0003J\b\u0010\u001e\u001a\u00020\tH\u0003J\b\u0010\u001f\u001a\u00020\tH\u0003J\u000e\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0005J\b\u0010\"\u001a\u00020\tH\u0003J\b\u0010#\u001a\u00020\tH\u0003J\b\u0010$\u001a\u00020\tH\u0003J\b\u0010%\u001a\u00020\tH\u0007J\b\u0010&\u001a\u00020\tH\u0007J\b\u0010\'\u001a\u00020\tH\u0007J\u0010\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0005H\u0003J\u0010\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0003J\u0012\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/compose/View/Atributos/ComposeAtributos;", "Landroidx/activity/ComponentActivity;", "()V", "listaLinguagensDeProgramacao", "", "", "listaUsuarios", "Lnet/developermaster/kotlincanivetesuico/ui/compose/model/ModelComposeGeral;", "BotaoComIcone", "", "BotaoContador", "BotaoSemIcone", "CaixaDeTextoOutLineTextField", "CaixaDeTextoTextFild", "CardViews", "CheckBox", "ColumnContador", "ColumnCustomizada", "ColumnLista", "ColumnSimples", "Espaco", "ExtendedFab", "Fab", "Home", "IconeComClique", "IconeSemClique", "IconeSimples1", "IconeSimples2", "Imagem", "LazyColumnPrincipal", "LazyRowIcone", "LazyRowUsuarios", "MensagemToast", "messagem", "RadioOption", "RowSimples", "SwitchOnOff", "TextColumnCustomizado", "TextColumnSimples", "TextRowSimples", "TextToast", "nome", "itensDoCardView", "modelCompose", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ComposeAtributos extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<net.developermaster.kotlincanivetesuico.ui.compose.model.ModelComposeGeral> listaUsuarios = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> listaLinguagensDeProgramacao = null;
    
    public ComposeAtributos() {
        super(0);
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.compose.runtime.Composable
    public final void Home() {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyColumnPrincipal() {
    }
    
    @androidx.compose.runtime.Composable
    private final void CardViews() {
    }
    
    @androidx.compose.runtime.Composable
    private final void itensDoCardView(net.developermaster.kotlincanivetesuico.ui.compose.model.ModelComposeGeral modelCompose) {
    }
    
    @androidx.compose.runtime.Composable
    private final void RadioOption() {
    }
    
    @androidx.compose.runtime.Composable
    private final void SwitchOnOff() {
    }
    
    @androidx.compose.runtime.Composable
    private final void CheckBox() {
    }
    
    @androidx.compose.runtime.Composable
    private final void ExtendedFab() {
    }
    
    @androidx.compose.runtime.Composable
    private final void Fab() {
    }
    
    @androidx.compose.runtime.Composable
    private final void ColumnLista() {
    }
    
    @androidx.compose.runtime.Composable
    private final void CaixaDeTextoOutLineTextField() {
    }
    
    @androidx.compose.runtime.Composable
    private final void CaixaDeTextoTextFild() {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyRowUsuarios() {
    }
    
    @androidx.compose.runtime.Composable
    private final void LazyRowIcone() {
    }
    
    @androidx.compose.runtime.Composable
    private final void RowSimples() {
    }
    
    @androidx.compose.runtime.Composable
    private final void ColumnSimples() {
    }
    
    @androidx.compose.runtime.Composable
    private final void ColumnContador() {
    }
    
    @androidx.compose.runtime.Composable
    private final void ColumnCustomizada() {
    }
    
    @androidx.compose.runtime.Composable
    private final void Espaco() {
    }
    
    @androidx.compose.runtime.Composable
    private final void BotaoSemIcone() {
    }
    
    @androidx.compose.runtime.Composable
    private final void BotaoContador() {
    }
    
    @androidx.compose.runtime.Composable
    private final void BotaoComIcone() {
    }
    
    @androidx.compose.runtime.Composable
    private final void IconeSimples1() {
    }
    
    @androidx.compose.runtime.Composable
    private final void IconeSimples2() {
    }
    
    @androidx.compose.runtime.Composable
    private final void IconeSemClique() {
    }
    
    @androidx.compose.runtime.Composable
    private final void IconeComClique() {
    }
    
    @androidx.compose.runtime.Composable
    private final void Imagem() {
    }
    
    @androidx.compose.runtime.Composable
    private final void TextToast(java.lang.String nome) {
    }
    
    public final void MensagemToast(@org.jetbrains.annotations.NotNull
    java.lang.String messagem) {
    }
    
    @androidx.compose.runtime.Composable
    public final void TextRowSimples() {
    }
    
    @androidx.compose.runtime.Composable
    public final void TextColumnSimples() {
    }
    
    @androidx.compose.runtime.Composable
    public final void TextColumnCustomizado() {
    }
}