// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.remoto.InterfaceDomainDummyProdutos;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.repositoryDomain.RepositorioDummyDomain;

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
public final class ModuloApi_ProverInterfaceRepositoryDomainApiDummyProdutosFactory implements Factory<RepositorioDummyDomain> {
  private final Provider<InterfaceDomainDummyProdutos> interfacedomainapidummyProdutosProvider;

  public ModuloApi_ProverInterfaceRepositoryDomainApiDummyProdutosFactory(
      Provider<InterfaceDomainDummyProdutos> interfacedomainapidummyProdutosProvider) {
    this.interfacedomainapidummyProdutosProvider = interfacedomainapidummyProdutosProvider;
  }

  @Override
  public RepositorioDummyDomain get() {
    return proverInterfaceRepositoryDomainApiDummyProdutos(interfacedomainapidummyProdutosProvider.get());
  }

  public static ModuloApi_ProverInterfaceRepositoryDomainApiDummyProdutosFactory create(
      Provider<InterfaceDomainDummyProdutos> interfacedomainapidummyProdutosProvider) {
    return new ModuloApi_ProverInterfaceRepositoryDomainApiDummyProdutosFactory(interfacedomainapidummyProdutosProvider);
  }

  public static RepositorioDummyDomain proverInterfaceRepositoryDomainApiDummyProdutos(
      InterfaceDomainDummyProdutos interfacedomainapidummyProdutos) {
    return Preconditions.checkNotNullFromProvides(ModuloApi.INSTANCE.proverInterfaceRepositoryDomainApiDummyProdutos(interfacedomainapidummyProdutos));
  }
}
