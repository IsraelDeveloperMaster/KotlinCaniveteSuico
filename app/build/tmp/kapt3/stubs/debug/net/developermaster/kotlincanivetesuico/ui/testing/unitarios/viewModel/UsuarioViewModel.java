package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain.UsuarioUseCase;
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/viewModel/UsuarioViewModel;", "Landroidx/lifecycle/ViewModel;", "usuarioUseCase", "Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/domain/UsuarioUseCase;", "(Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/domain/UsuarioUseCase;)V", "_listaUsuarios", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/model/dto/Usuario;", "listaUsuarios", "Landroidx/lifecycle/LiveData;", "getListaUsuarios", "()Landroidx/lifecycle/LiveData;", "getUsuarioUseCase", "()Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/domain/UsuarioUseCase;", "recuperarListaUsuarios", "", "app_debug"})
public final class UsuarioViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain.UsuarioUseCase usuarioUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario>> _listaUsuarios = null;
    
    public UsuarioViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain.UsuarioUseCase usuarioUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain.UsuarioUseCase getUsuarioUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario>> getListaUsuarios() {
        return null;
    }
    
    public final void recuperarListaUsuarios() {
    }
}