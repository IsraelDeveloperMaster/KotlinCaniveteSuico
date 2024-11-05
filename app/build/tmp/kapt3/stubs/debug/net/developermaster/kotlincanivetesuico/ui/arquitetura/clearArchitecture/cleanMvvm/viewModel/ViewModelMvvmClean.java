package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository.RepositorioDataMvvmClean;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanMvvm/viewModel/ViewModelMvvmClean;", "Landroidx/lifecycle/ViewModel;", "interfaceRepositorio", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanMvvm/data/repository/RepositorioDataMvvmClean;", "(Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanMvvm/data/repository/RepositorioDataMvvmClean;)V", "listaDePostagens", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanMvvm/data/model/ModelApiMvvmClean;", "getListaDePostagens", "()Landroidx/lifecycle/MutableLiveData;", "setListaDePostagens", "(Landroidx/lifecycle/MutableLiveData;)V", "recuperaPostagensApiJsonPlaceHolder", "", "app_debug"})
public final class ViewModelMvvmClean extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository.RepositorioDataMvvmClean interfaceRepositorio = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean>> listaDePostagens;
    
    public ViewModelMvvmClean(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository.RepositorioDataMvvmClean interfaceRepositorio) {
        super();
    }
    
    public final void setListaDePostagens(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean>> getListaDePostagens() {
        return null;
    }
    
    public final void recuperaPostagensApiJsonPlaceHolder() {
    }
}