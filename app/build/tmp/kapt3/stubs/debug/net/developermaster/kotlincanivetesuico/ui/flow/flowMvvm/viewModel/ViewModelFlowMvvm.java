package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.viewModel;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.domain.UseCaseFlowMvvm;
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ListaFlowMvvm;
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ModelFlowMvvm;
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository.RepositoryFlowMvvm;
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/viewModel/ViewModelFlowMvvm;", "Landroidx/lifecycle/ViewModel;", "()V", "estadoFlowPrivado", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/view/FlowEstado;", "estadoFlowPublico", "Lkotlinx/coroutines/flow/StateFlow;", "getEstadoFlowPublico", "()Lkotlinx/coroutines/flow/StateFlow;", "modelFlowMvvmMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/model/ModelFlowMvvm;", "repositoryFlowMvvm", "Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/repository/RepositoryFlowMvvm;", "useCaseFlowMvvm", "Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/domain/UseCaseFlowMvvm;", "getUseCaseFlowMvvm", "()Lnet/developermaster/kotlincanivetesuico/ui/flow/flowMvvm/domain/UseCaseFlowMvvm;", "example1", "", "example2", "example3", "example4", "example5", "example6", "example7", "funcaoViewModelRandom", "save", "info", "", "app_debug"})
public final class ViewModelFlowMvvm extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.domain.UseCaseFlowMvvm useCaseFlowMvvm = null;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository.RepositoryFlowMvvm repositoryFlowMvvm = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado> estadoFlowPrivado = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado> estadoFlowPublico = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ModelFlowMvvm> modelFlowMvvmMutableLiveData = null;
    
    public ViewModelFlowMvvm() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.domain.UseCaseFlowMvvm getUseCaseFlowMvvm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado> getEstadoFlowPublico() {
        return null;
    }
    
    public final void funcaoViewModelRandom() {
    }
    
    public final void example1() {
    }
    
    public final void example2() {
    }
    
    public final void example3() {
    }
    
    public final void example4() {
    }
    
    public final void example5() {
    }
    
    public final void example6() {
    }
    
    public final void example7() {
    }
    
    private final void save(java.lang.String info) {
    }
}