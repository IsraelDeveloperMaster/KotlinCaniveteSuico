package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.viewModel;

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
    topLevelClass = ViewModelDomainUsuarios.class
)
public final class ViewModelDomainUsuarios_HiltModules {
  private ViewModelDomainUsuarios_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @LazyClassKey(ViewModelDomainUsuarios.class)
    @HiltViewModelMap
    public abstract ViewModel binds(ViewModelDomainUsuarios vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoMap
    @LazyClassKey(ViewModelDomainUsuarios.class)
    @HiltViewModelMap.KeySet
    public static boolean provide() {
      return true;
    }
  }
}
