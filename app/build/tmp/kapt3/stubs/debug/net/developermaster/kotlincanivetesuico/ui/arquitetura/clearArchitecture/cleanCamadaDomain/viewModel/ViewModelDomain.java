package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/viewModel/ViewModelDomain;", "Landroidx/lifecycle/ViewModel;", "postagemUseCase", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/domain/userCase/PostagemUseCase;", "(Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/domain/userCase/PostagemUseCase;)V", "listaDePostagens", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/domain/modelDomain/ModelPostagemModelDomain;", "getListaDePostagens", "()Landroidx/lifecycle/MutableLiveData;", "setListaDePostagens", "(Landroidx/lifecycle/MutableLiveData;)V", "getPostagemUseCase", "()Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/domain/userCase/PostagemUseCase;", "recuperaPostagensApiJsonPlaceHolder", "", "app_debug"})
public final class ViewModelDomain extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase postagemUseCase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain>> listaDePostagens;
    
    public ViewModelDomain(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase postagemUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase getPostagemUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain>> getListaDePostagens() {
        return null;
    }
    
    public final void setListaDePostagens(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain>> p0) {
    }
    
    public final void recuperaPostagensApiJsonPlaceHolder() {
    }
}