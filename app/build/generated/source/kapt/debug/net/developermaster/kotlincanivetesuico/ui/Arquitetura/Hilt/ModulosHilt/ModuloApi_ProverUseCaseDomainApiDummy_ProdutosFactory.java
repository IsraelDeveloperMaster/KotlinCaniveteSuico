// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.ModulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.RepositoryDomain.InterfaceRepositoryDomain;
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyProdutos.Domain.UseCase.GetUseCaseDomainApiDummy_Produtos;

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
public final class ModuloApi_ProverUseCaseDomainApiDummy_ProdutosFactory implements Factory<GetUseCaseDomainApiDummy_Produtos> {
  private final Provider<InterfaceRepositoryDomain> interfacerepositorydomainapidummyProdutosProvider;

  public ModuloApi_ProverUseCaseDomainApiDummy_ProdutosFactory(
      Provider<InterfaceRepositoryDomain> interfacerepositorydomainapidummyProdutosProvider) {
    this.interfacerepositorydomainapidummyProdutosProvider = interfacerepositorydomainapidummyProdutosProvider;
  }

  @Override
  public GetUseCaseDomainApiDummy_Produtos get() {
    return proverUseCaseDomainApiDummy_Produtos(interfacerepositorydomainapidummyProdutosProvider.get());
  }

  public static ModuloApi_ProverUseCaseDomainApiDummy_ProdutosFactory create(
      Provider<InterfaceRepositoryDomain> interfacerepositorydomainapidummyProdutosProvider) {
    return new ModuloApi_ProverUseCaseDomainApiDummy_ProdutosFactory(interfacerepositorydomainapidummyProdutosProvider);
  }

  public static GetUseCaseDomainApiDummy_Produtos proverUseCaseDomainApiDummy_Produtos(
      InterfaceRepositoryDomain interfacerepositorydomainapidummyProdutos) {
    return Preconditions.checkNotNullFromProvides(ModuloApi.INSTANCE.proverUseCaseDomainApiDummy_Produtos(interfacerepositorydomainapidummyProdutos));
  }
}
