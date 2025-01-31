// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.UseCase.GetUseCaseDomainDummyProdutos;

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
public final class ViewModelDomainProdutos_Factory implements Factory<ViewModelDomainProdutos> {
  private final Provider<GetUseCaseDomainDummyProdutos> produtosUseCaseProvider;

  public ViewModelDomainProdutos_Factory(
      Provider<GetUseCaseDomainDummyProdutos> produtosUseCaseProvider) {
    this.produtosUseCaseProvider = produtosUseCaseProvider;
  }

  @Override
  public ViewModelDomainProdutos get() {
    return newInstance(produtosUseCaseProvider.get());
  }

  public static ViewModelDomainProdutos_Factory create(
      Provider<GetUseCaseDomainDummyProdutos> produtosUseCaseProvider) {
    return new ViewModelDomainProdutos_Factory(produtosUseCaseProvider);
  }

  public static ViewModelDomainProdutos newInstance(GetUseCaseDomainDummyProdutos produtosUseCase) {
    return new ViewModelDomainProdutos(produtosUseCase);
  }
}
