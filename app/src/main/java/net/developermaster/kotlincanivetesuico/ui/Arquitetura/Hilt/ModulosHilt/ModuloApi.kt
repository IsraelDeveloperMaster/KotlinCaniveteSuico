package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.ModulosHilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.Constantes.BaseUrlApi_Dummy.BASE_URL_API_DUMMY
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.API.InterfaceDomainApiDummyProdutos
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Data.Repository.InterfaceRepositoryImpl
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.RepositoryDomain.InterfaceRepositoryDomain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.UseCase.GetUseCaseDomainApiDummy_Produtos
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.API.InterfaceDomainApiDummy_Usuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Repository.InterfaceRepositoryImplUsuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.Repository.InterfaceRepositorioUsuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.UseCase.GetUseCaseDomainApiDummy_Usuarios
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
    fun proverRetrofitDummy(): Retrofit {

        return Retrofit.Builder().baseUrl(BASE_URL_API_DUMMY) .addConverterFactory(GsonConverterFactory.create()).build()
    }

    //todo prover interface api dummy usuarios
    @Provides
    fun proverInterfaceApiDummy_Usuarios(retrofit: Retrofit): InterfaceDomainApiDummy_Usuarios {

        return retrofit.create(InterfaceDomainApiDummy_Usuarios::class.java)
    }

    //todo prover interface api dummy produtos
    @Provides
    fun proverInterfaceApiDummy_Produtos(retrofit: Retrofit): InterfaceDomainApiDummyProdutos {

        return retrofit.create(InterfaceDomainApiDummyProdutos::class.java)
    }

    //todo prover interface repository domain dummy usuarios
    @Provides
    fun proverInterfaceRepositoryDomainApiDummy_Usuarios(interfacedomainapidummyUsuarios: InterfaceDomainApiDummy_Usuarios): InterfaceRepositorioUsuarios {

        return InterfaceRepositoryImplUsuarios(interfacedomainapidummyUsuarios)
    }

    //todo prover interface repository domain Produtos
    @Provides
    fun proverInterfaceRepositoryDomainApiDummy_Produtos(interfacedomainapidummyProdutos: InterfaceDomainApiDummyProdutos): InterfaceRepositoryDomain {

        return InterfaceRepositoryImpl(interfacedomainapidummyProdutos)
    }

    //todo prover usecase dummy usuarios
    @Provides
    fun proverUseCaseDomainApiDummy_Usuarios(interfacerepositorydomainapidummyUsuarios: InterfaceRepositorioUsuarios): GetUseCaseDomainApiDummy_Usuarios {

        return GetUseCaseDomainApiDummy_Usuarios(interfacerepositorydomainapidummyUsuarios)
    }

    //todo prover usecase dummy produtos
    @Provides
    fun proverUseCaseDomainApiDummy_Produtos(interfacerepositorydomainapidummyProdutos: InterfaceRepositoryDomain): GetUseCaseDomainApiDummy_Produtos {

        return GetUseCaseDomainApiDummy_Produtos(interfacerepositorydomainapidummyProdutos)
    }
}