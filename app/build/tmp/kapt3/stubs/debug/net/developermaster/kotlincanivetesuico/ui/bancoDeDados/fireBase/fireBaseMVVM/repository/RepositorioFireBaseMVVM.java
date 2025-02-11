package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u0004J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00152\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0015J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/repository/RepositorioFireBaseMVVM;", "", "()V", "fotoAdapterUrl", "", "listaDadosFirebase", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/model/ModelFireBaseMVVM;", "funcaoAtualizaImagemDocumentAdapterPeloRepositorio", "", "idImagem", "funcaoAtualizaPeloRepositorio", "modelFireBaseMVVM", "funcaoAutenticarPeloRepositorio", "", "email", "senha", "funcaoDeletarPeloRepositorio", "funcaoListarFotoPerfilPeloRepositorio", "funcaoListarIdadePeloRepositorio", "Landroidx/lifecycle/LiveData;", "idade", "funcaoListarNomePeloRepositorio", "nome", "funcaoListarTodosPeloRepositorio", "funcaoSalvaPeloRepositorio", "app_debug"})
public final class RepositorioFireBaseMVVM {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM>> listaDadosFirebase = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String fotoAdapterUrl = "";
    
    public RepositorioFireBaseMVVM() {
        super();
    }
    
    public final void funcaoAtualizaImagemDocumentAdapterPeloRepositorio(@org.jetbrains.annotations.NotNull
    java.lang.String idImagem) {
    }
    
    public final void funcaoAtualizaPeloRepositorio(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    public final void funcaoSalvaPeloRepositorio(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM>> funcaoListarTodosPeloRepositorio() {
        return null;
    }
    
    public final void funcaoDeletarPeloRepositorio(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM>> funcaoListarNomePeloRepositorio(@org.jetbrains.annotations.NotNull
    java.lang.String nome) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM>> funcaoListarIdadePeloRepositorio(@org.jetbrains.annotations.NotNull
    java.lang.String idade) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String funcaoListarFotoPerfilPeloRepositorio() {
        return null;
    }
    
    public final boolean funcaoAutenticarPeloRepositorio(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String senha) {
        return false;
    }
}