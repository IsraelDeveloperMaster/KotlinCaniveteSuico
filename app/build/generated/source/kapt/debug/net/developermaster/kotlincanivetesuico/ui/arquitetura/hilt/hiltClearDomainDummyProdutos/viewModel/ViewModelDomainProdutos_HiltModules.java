package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.viewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

@OriginatingElement(
    topLevelClass = ViewModelDomainProdutos.class
)
public final class ViewModelDomainProdutos_HiltModules {
  private ViewModelDomainProdutos_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @LazyClassKey(ViewModelDomainProdutos.class)
    @HiltViewModelMap
    public abstract ViewModel binds(ViewModelDomainProdutos vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoMap
    @LazyClassKey(ViewModelDomainProdutos.class)
    @HiltViewModelMap.KeySet
    public static boolean provide() {
      return true;
    }
  }
}
