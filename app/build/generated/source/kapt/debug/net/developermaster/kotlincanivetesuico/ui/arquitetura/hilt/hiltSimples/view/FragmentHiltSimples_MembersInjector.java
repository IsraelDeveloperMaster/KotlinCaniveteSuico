// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.view;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseSendoInjetada;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class FragmentHiltSimples_MembersInjector implements MembersInjector<FragmentHiltSimples> {
  private final Provider<ClasseSendoInjetada> classeSendoInjetadaProvider;

  public FragmentHiltSimples_MembersInjector(
      Provider<ClasseSendoInjetada> classeSendoInjetadaProvider) {
    this.classeSendoInjetadaProvider = classeSendoInjetadaProvider;
  }

  public static MembersInjector<FragmentHiltSimples> create(
      Provider<ClasseSendoInjetada> classeSendoInjetadaProvider) {
    return new FragmentHiltSimples_MembersInjector(classeSendoInjetadaProvider);
  }

  @Override
  public void injectMembers(FragmentHiltSimples instance) {
    injectClasseSendoInjetada(instance, classeSendoInjetadaProvider.get());
  }

  @InjectedFieldSignature("net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.view.FragmentHiltSimples.classeSendoInjetada")
  public static void injectClasseSendoInjetada(FragmentHiltSimples instance,
      ClasseSendoInjetada classeSendoInjetada) {
    instance.classeSendoInjetada = classeSendoInjetada;
  }
}