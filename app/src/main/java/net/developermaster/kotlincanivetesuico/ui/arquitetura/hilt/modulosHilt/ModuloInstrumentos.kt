package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Banda
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento
import javax.inject.Named

@Module
@InstallIn( FragmentComponent::class ) // todo este componente estara ativo enquanto o fragment estiver ativo
//@InstallIn( ActivityCompat::class ) // todo este componente estara ativo enquanto  a activity estiver ativo
//@InstallIn( SingletonComponent::class )// todo este componente estara ativo enquanto o app estiver ativo
//@InstallIn( ViewModelComponent::class )// todo este componente estara ativo enquanto o viewmodel estiver ativo
//@InstallIn( ServiceComponent::class )// todo este componente estara ativo enquanto o servico estiver ativo

object ModuloInstrumentos {

    @Provides
    fun proverBanda(@Named("violao") violao : InterfaceInstrumento, @Named("bateria") bateria : InterfaceInstrumento, @Named("guitarra") guitarra : InterfaceInstrumento ) : Banda {

        return Banda( violao, bateria , guitarra )
    }
}