// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.view;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Banda;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Musico;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class FragmentHiltDependenciasNomeadas_MembersInjector implements MembersInjector<FragmentHiltDependenciasNomeadas> {
  private final Provider<Musico> musicoProvider;

  private final Provider<Banda> bandaProvider;

  public FragmentHiltDependenciasNomeadas_MembersInjector(Provider<Musico> musicoProvider,
      Provider<Banda> bandaProvider) {
    this.musicoProvider = musicoProvider;
    this.bandaProvider = bandaProvider;
  }

  public static MembersInjector<FragmentHiltDependenciasNomeadas> create(
      Provider<Musico> musicoProvider, Provider<Banda> bandaProvider) {
    return new FragmentHiltDependenciasNomeadas_MembersInjector(musicoProvider, bandaProvider);
  }

  @Override
  public void injectMembers(FragmentHiltDependenciasNomeadas instance) {
    injectMusico(instance, musicoProvider.get());
    injectBanda(instance, bandaProvider.get());
  }

  @InjectedFieldSignature("net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.view.FragmentHiltDependenciasNomeadas.musico")
  public static void injectMusico(FragmentHiltDependenciasNomeadas instance, Musico musico) {
    instance.musico = musico;
  }

  @InjectedFieldSignature("net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.view.FragmentHiltDependenciasNomeadas.banda")
  public static void injectBanda(FragmentHiltDependenciasNomeadas instance, Banda banda) {
    instance.banda = banda;
  }
}
