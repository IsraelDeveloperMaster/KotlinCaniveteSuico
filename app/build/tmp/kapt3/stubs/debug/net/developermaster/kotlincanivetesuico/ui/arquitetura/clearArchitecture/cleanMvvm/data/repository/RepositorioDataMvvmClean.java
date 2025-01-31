package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository;

import androidx.lifecycle.MutableLiveData;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanMvvm/data/repository/RepositorioDataMvvmClean;", "", "listaDePostagensRecuperadaDoRepositorio", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanMvvm/data/model/ModelApiMvvmClean;", "getListaDePostagensRecuperadaDoRepositorio", "()Landroidx/lifecycle/MutableLiveData;", "funcaoRecuperaPostagens", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RepositorioDataMvvmClean {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean>> getListaDePostagensRecuperadaDoRepositorio();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object funcaoRecuperaPostagens(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}