package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.constantes.BaseUrlApi_Dummy.BASE_URL_API_DUMMY
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto.InterfaceDomainDummyProdutos
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.repository.RepositorioDummyImpl
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.UseCase.GetUseCaseDomainDummyProdutos
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto.InterfaceDomainDummyUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.repository.RepositoryImplDummyUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.useCase.GetUseCaseDomainApiDummy_Usuarios
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository.RepositoryComposeMvvm
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository.RepositoryComposeMvvmImpl
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote.InterfaceComposeDummyApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
//@InstallIn( FragmentComponent::class ) // todo este componente estara ativo enquanto o fragment estiver ativo
//@InstallIn( ActivityCompat::class ) // todo este componente estara ativo enquanto  a activity estiver ativo
//@InstallIn( SingletonComponent::class )// todo este componente estara ativo enquanto o app estiver ativo
@InstallIn(ViewModelComponent::class)// todo este componente estara ativo enquanto o viewmodel estiver ativo
//@InstallIn( ServiceComponent::class )// todo este componente estara ativo enquanto o servico estiver ativo

object ModuloApi {

    //todo prover retrofit dummy geral
    @Provides
    fun proverRetrofitDummy() : Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL_API_DUMMY)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //todo prover interface api dummy usuarios
    @Provides
    fun proverInterfaceApiDummyUsuarios(retrofit: Retrofit): InterfaceDomainDummyUsuarios {

        return retrofit.create(InterfaceDomainDummyUsuarios::class.java)
    }

    //todo prover interface api dummy usuarios para o compose
    @Provides
    fun proverInterfaceApiDummyUsuariosCompose( retrofit : Retrofit ) : InterfaceComposeDummyApi {

        return retrofit.create( InterfaceComposeDummyApi::class.java )
    }

    //todo prover repository dummy usuarios para o compose
    @Provides
    fun proverRepositoryApiDummyUsuariosCompose( interfaceComposeDummyApi : InterfaceComposeDummyApi ) : RepositoryComposeMvvm {

        return RepositoryComposeMvvmImpl( interfaceComposeDummyApi )
    }

    //todo prover interface api dummy produtos
    @Provides
    fun proverInterfaceApiDummyProdutos(retrofit: Retrofit): InterfaceDomainDummyProdutos {

        return retrofit.create(InterfaceDomainDummyProdutos::class.java)
    }

    //todo prover interface repository domain dummy usuarios
    @Provides
    fun proverInterfaceRepositoryDomainApiDummy_Usuarios(interfacedomainapidummyUsuarios: InterfaceDomainDummyUsuarios): RepositorioDummyUsuarios {

        return RepositoryImplDummyUsuarios(interfacedomainapidummyUsuarios)
    }

    //todo prover interface repository domain Produtos
    @Provides
    fun proverInterfaceRepositoryDomainApiDummyProdutos(interfacedomainapidummyProdutos: InterfaceDomainDummyProdutos): RepositorioDummyDomain {

        return RepositorioDummyImpl(interfacedomainapidummyProdutos)
    }

    //todo prover usecase dummy usuarios
    @Provides
    fun proverUseCaseDomainApiDummyUsuarios(RepositorioDummyUsuarios: RepositorioDummyUsuarios): GetUseCaseDomainApiDummy_Usuarios {

        return GetUseCaseDomainApiDummy_Usuarios(RepositorioDummyUsuarios)
    }

    //todo prover usecase dummy produtos
    @Provides
    fun proverUseCaseDomainApiDummyProdutos(repositorydomaindummyProdutos: RepositorioDummyDomain): GetUseCaseDomainDummyProdutos {

        return GetUseCaseDomainDummyProdutos(repositorydomaindummyProdutos)
    }
}