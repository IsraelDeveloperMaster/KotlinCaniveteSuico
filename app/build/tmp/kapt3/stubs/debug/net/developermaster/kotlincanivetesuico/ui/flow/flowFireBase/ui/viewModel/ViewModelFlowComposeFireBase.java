package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.google.firebase.storage.FirebaseStorage;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.repository.RepositoryFlowComposeFireBase;
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006 "}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/flow/flowFireBase/ui/viewModel/ViewModelFlowComposeFireBase;", "Landroidx/lifecycle/ViewModel;", "()V", "_myDataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "estadoFlowPrivado", "Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/view/FlowEstado;", "estadoFlowPublico", "Lkotlinx/coroutines/flow/StateFlow;", "getEstadoFlowPublico", "()Lkotlinx/coroutines/flow/StateFlow;", "imagemFlow", "Lkotlinx/coroutines/flow/Flow;", "getImagemFlow", "()Lkotlinx/coroutines/flow/Flow;", "setImagemFlow", "(Lkotlinx/coroutines/flow/Flow;)V", "imagemRetornadaPelaInternet", "getImagemRetornadaPelaInternet", "()Ljava/lang/String;", "setImagemRetornadaPelaInternet", "(Ljava/lang/String;)V", "myDataFlow", "getMyDataFlow", "repositoryFlowComposeFireBase", "Lnet/developermaster/kotlincanivetesuico/ui/flow/flowFireBase/repository/RepositoryFlowComposeFireBase;", "getRepositoryFlowComposeFireBase", "()Lnet/developermaster/kotlincanivetesuico/ui/flow/flowFireBase/repository/RepositoryFlowComposeFireBase;", "example6", "", "updateData", "app_debug"})
public final class ViewModelFlowComposeFireBase extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado> estadoFlowPrivado = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado> estadoFlowPublico = null;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.repository.RepositoryFlowComposeFireBase repositoryFlowComposeFireBase = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String imagemRetornadaPelaInternet = "";
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<java.lang.String> imagemFlow;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _myDataFlow = null;
    
    public ViewModelFlowComposeFireBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado> getEstadoFlowPublico() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.repository.RepositoryFlowComposeFireBase getRepositoryFlowComposeFireBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImagemRetornadaPelaInternet() {
        return null;
    }
    
    public final void setImagemRetornadaPelaInternet(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getImagemFlow() {
        return null;
    }
    
    public final void setImagemFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getMyDataFlow() {
        return null;
    }
    
    public final void updateData() {
    }
    
    public final void example6() {
    }
}