// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.remoto.InterfaceDomainDummyUsuarios;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository.RepositorioDummyUsuarios;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ModuloApi_ProverInterfaceRepositoryDomainApiDummy_UsuariosFactory implements Factory<RepositorioDummyUsuarios> {
  private final Provider<InterfaceDomainDummyUsuarios> interfacedomainapidummyUsuariosProvider;

  public ModuloApi_ProverInterfaceRepositoryDomainApiDummy_UsuariosFactory(
      Provider<InterfaceDomainDummyUsuarios> interfacedomainapidummyUsuariosProvider) {
    this.interfacedomainapidummyUsuariosProvider = interfacedomainapidummyUsuariosProvider;
  }

  @Override
  public RepositorioDummyUsuarios get() {
    return proverInterfaceRepositoryDomainApiDummy_Usuarios(interfacedomainapidummyUsuariosProvider.get());
  }

  public static ModuloApi_ProverInterfaceRepositoryDomainApiDummy_UsuariosFactory create(
      Provider<InterfaceDomainDummyUsuarios> interfacedomainapidummyUsuariosProvider) {
    return new ModuloApi_ProverInterfaceRepositoryDomainApiDummy_UsuariosFactory(interfacedomainapidummyUsuariosProvider);
  }

  public static RepositorioDummyUsuarios proverInterfaceRepositoryDomainApiDummy_Usuarios(
      InterfaceDomainDummyUsuarios interfacedomainapidummyUsuarios) {
    return Preconditions.checkNotNullFromProvides(ModuloApi.INSTANCE.proverInterfaceRepositoryDomainApiDummy_Usuarios(interfacedomainapidummyUsuarios));
  }
}
