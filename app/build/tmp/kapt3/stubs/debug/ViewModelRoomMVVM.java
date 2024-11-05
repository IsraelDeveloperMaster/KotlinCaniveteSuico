
import android.app.Application;
import android.util.Log;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dataBase.BancoDeDadosRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository.RepositorioRoomMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020#J\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020#J\u0006\u0010)\u001a\u00020%R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"LViewModelRoomMVVM;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "listarId", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/modelEntidades/ModelEntidadeRoomMVVM;", "listarIdade", "listarNome", "observerListarId", "getObserverListarId", "()Landroidx/lifecycle/MutableLiveData;", "observerListarIdade", "getObserverListarIdade", "observerListarNome", "getObserverListarNome", "observerListarTodos", "getObserverListarTodos", "observerListarTodos$delegate", "Lkotlin/Lazy;", "repositorioRoomMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/Repository/RepositorioRoomMVVM;", "getRepositorioRoomMVVM", "()Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/Repository/RepositorioRoomMVVM;", "setRepositorioRoomMVVM", "(Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/Repository/RepositorioRoomMVVM;)V", "funcaAdicionarPeloViewModel", "Lkotlinx/coroutines/Job;", "modelEntidadeRoomMVVM", "funcaoAtualizarPeloViewModel", "funcaoDeletarPeloViewModel", "funcaoListarIdPeloViewModel", "id", "", "funcaoListarIdadePeloViewModel", "", "idade", "funcaoListarNomePeloViewModel", "nome", "funcaoListarTodosPeloViewModel", "app_debug"})
public final class ViewModelRoomMVVM extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository.RepositorioRoomMVVM repositorioRoomMVVM;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy observerListarTodos$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> observerListarId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> listarId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> observerListarNome = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> listarNome = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> observerListarIdade = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> listarIdade = null;
    
    public ViewModelRoomMVVM(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository.RepositorioRoomMVVM getRepositorioRoomMVVM() {
        return null;
    }
    
    public final void setRepositorioRoomMVVM(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository.RepositorioRoomMVVM p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> getObserverListarTodos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> getObserverListarId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> getObserverListarNome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> getObserverListarIdade() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job funcaAdicionarPeloViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM modelEntidadeRoomMVVM) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job funcaoAtualizarPeloViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM modelEntidadeRoomMVVM) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job funcaoDeletarPeloViewModel(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM modelEntidadeRoomMVVM) {
        return null;
    }
    
    public final void funcaoListarTodosPeloViewModel() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job funcaoListarIdPeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job funcaoListarNomePeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String nome) {
        return null;
    }
    
    public final void funcaoListarIdadePeloViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String idade) {
    }
}