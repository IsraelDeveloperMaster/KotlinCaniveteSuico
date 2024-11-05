package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository.RepositorioFireBaseMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0011J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/viewModel/ViewModelFireBaseMVVM;", "Landroidx/lifecycle/ViewModel;", "()V", "fotoPerfilMutable", "Landroidx/lifecycle/MutableLiveData;", "", "observaFotoPerfilLiveData", "Landroidx/lifecycle/LiveData;", "getObservaFotoPerfilLiveData", "()Landroidx/lifecycle/LiveData;", "observaListaTodosRepositorioFireBaseMVVM", "", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/model/ModelFireBaseMVVM;", "getObservaListaTodosRepositorioFireBaseMVVM", "repositorioFireBaseMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/repository/RepositorioFireBaseMVVM;", "funcaoAtualizaImagemDocumentAdapterPeloViewModel", "", "idImagemAdapter", "funcaoAtualizarPeloViewModel", "modelFireBaseMVVM", "funcaoAutenticarPeloViewModel", "email", "senha", "funcaoDeletarPeloViewModel", "funcaoListarFotoPerfilPeloViewModel", "funcaoListarIdadePeloViewModel", "idade", "funcaoListarNomePeloViewModel", "nome", "funcaoListarTodosPeloViewModel", "funcaoSalvaPeloViewModel", "app_debug"})
public final class ViewModelFireBaseMVVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> fotoPerfilMutable = null;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository.RepositorioFireBaseMVVM repositorioFireBaseMVVM = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM>> observaListaTodosRepositorioFireBaseMVVM = null;
    
    public ViewModelFireBaseMVVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getObservaFotoPerfilLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM>> getObservaListaTodosRepositorioFireBaseMVVM() {
        return null;
    }
    
    public final void funcaoAutenticarPeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String senha) {
    }
    
    public final void funcaoListarNomePeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String nome) {
    }
    
    public final void funcaoListarIdadePeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String idade) {
    }
    
    public final void funcaoListarTodosPeloViewModel() {
    }
    
    public final void funcaoSalvaPeloViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    public final void funcaoAtualizarPeloViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    public final void funcaoDeletarPeloViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM) {
    }
    
    public final void funcaoListarFotoPerfilPeloViewModel() {
    }
    
    public final void funcaoAtualizaImagemDocumentAdapterPeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String idImagemAdapter) {
    }
}