package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Bateria
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Guitarra
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Musico
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Violao
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.InterfaceMotor
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.MotorHyblido
import javax.inject.Named

@Module
@InstallIn( FragmentComponent::class ) // todo este componente estara ativo enquanto o fragment estiver ativo
//@InstallIn( ActivityCompat::class ) // todo este componente estara ativo enquanto  a activity estiver ativo
//@InstallIn( SingletonComponent::class )// todo este componente estara ativo enquanto o app estiver ativo
//@InstallIn( ViewModelComponent::class )// todo este componente estara ativo enquanto o viewmodel estiver ativo
//@InstallIn( ServiceComponent::class )// todo este componente estara ativo enquanto o servico estiver ativo

object ModuloCarro {

    ///////////////// CLASSE COM E SEM CONTRUTORES /////////////////
    @Provides
    fun proveCarroSemConstrutor( ) : CarroSemConstrutor {//todo forma 1 / sem construtor na classe motor / @ApplicationContext recupera o context
          return CarroSemConstrutor(  )  //todo forma 2 / injetando a dependencia de motor sem construtor
    }

    @Provides
    fun proveCarroComConstrutor(interfaceMotor: InterfaceMotor, @ApplicationContext context : Context ) : CarroComConstrutor {//todo forma 1 / sem construtor na classe motor / @ApplicationContext recupera o context
        return CarroComConstrutor( interfaceMotor , context)  //todo forma 2 / injetando a dependencia de motor com construtor
    }

    @Provides
    fun proveMotorHybrido( ) : InterfaceMotor {
        return MotorHyblido( "Corolla" )//todo retorna motor hybrido
    }

    ///////////////// CLASSE COM DEPENDENCIAS NOMEADAS /////////////////
    @Provides
    fun proveMusico(@Named( "violao" ) interfaceInstrumento: InterfaceInstrumento, @ApplicationContext context : Context ) : Musico { //todo @Named define qual ,@Provides ira executor

        return Musico( interfaceInstrumento , context )//todo
    }

    @Provides
    @Named( "violao" )
    fun proveViolao(  ) : InterfaceInstrumento {//todo

        return Violao(  )//todo
    }

    @Provides
    @Named( "bateria" )
    fun proveBateria(  ) : InterfaceInstrumento {//todo

        return Bateria(  )//todo
    }

@Provides
@Named( "guitarra" )
fun proveGuitarra(  ) : InterfaceInstrumento {//todo o modulo so utiliza o provides guitarra quando nao esta nomeada no construtor

    return Guitarra(  )//todo
    }
}