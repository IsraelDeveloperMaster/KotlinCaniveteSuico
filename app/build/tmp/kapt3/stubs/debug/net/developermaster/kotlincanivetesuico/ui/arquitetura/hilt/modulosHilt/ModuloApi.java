package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto.InterfaceDomainDummyProdutos;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.repository.RepositorioDummyImpl;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.UseCase.GetUseCaseDomainDummyProdutos;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto.InterfaceDomainDummyUsuarios;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.repository.RepositoryImplDummyUsuarios;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.useCase.GetUseCaseDomainApiDummy_Usuarios;
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository.RepositoryComposeMvvm;
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository.RepositoryComposeMvvmImpl;
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote.InterfaceComposeDummyApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0007\u00a8\u0006\u001b"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/modulosHilt/ModuloApi;", "", "()V", "proverInterfaceApiDummyProdutos", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltClearDomainDummyProdutos/data/remoto/InterfaceDomainDummyProdutos;", "retrofit", "Lretrofit2/Retrofit;", "proverInterfaceApiDummyUsuarios", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltClearDomainDummyUsuarios/data/remoto/InterfaceDomainDummyUsuarios;", "proverInterfaceApiDummyUsuariosCompose", "Lnet/developermaster/kotlincanivetesuico/ui/compose/View/ScaffoldMVVM/data/remote/InterfaceComposeDummyApi;", "proverInterfaceRepositoryDomainApiDummyProdutos", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltClearDomainDummyProdutos/domain/repositoryDomain/RepositorioDummyDomain;", "interfacedomainapidummyProdutos", "proverInterfaceRepositoryDomainApiDummy_Usuarios", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltClearDomainDummyUsuarios/domain/repository/RepositorioDummyUsuarios;", "interfacedomainapidummyUsuarios", "proverRepositoryApiDummyUsuariosCompose", "Lnet/developermaster/kotlincanivetesuico/ui/compose/View/ScaffoldMVVM/data/Repository/RepositoryComposeMvvm;", "interfaceComposeDummyApi", "proverRetrofitDummy", "proverUseCaseDomainApiDummyProdutos", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltClearDomainDummyProdutos/domain/UseCase/GetUseCaseDomainDummyProdutos;", "repositorydomaindummyProdutos", "proverUseCaseDomainApiDummyUsuarios", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/hilt/hiltClearDomainDummyUsuarios/domain/useCase/GetUseCaseDomainApiDummy_Usuarios;", "RepositorioDummyUsuarios", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public final class ModuloApi {
    @org.jetbrains.annotations.NotNull
    public static final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt.ModuloApi INSTANCE = null;
    
    private ModuloApi() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit proverRetrofitDummy() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto.InterfaceDomainDummyUsuarios proverInterfaceApiDummyUsuarios(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote.InterfaceComposeDummyApi proverInterfaceApiDummyUsuariosCompose(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository.RepositoryComposeMvvm proverRepositoryApiDummyUsuariosCompose(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote.InterfaceComposeDummyApi interfaceComposeDummyApi) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto.InterfaceDomainDummyProdutos proverInterfaceApiDummyProdutos(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios proverInterfaceRepositoryDomainApiDummy_Usuarios(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto.InterfaceDomainDummyUsuarios interfacedomainapidummyUsuarios) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain proverInterfaceRepositoryDomainApiDummyProdutos(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto.InterfaceDomainDummyProdutos interfacedomainapidummyProdutos) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.useCase.GetUseCaseDomainApiDummy_Usuarios proverUseCaseDomainApiDummyUsuarios(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios RepositorioDummyUsuarios) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.UseCase.GetUseCaseDomainDummyProdutos proverUseCaseDomainApiDummyProdutos(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain repositorydomaindummyProdutos) {
        return null;
    }
}