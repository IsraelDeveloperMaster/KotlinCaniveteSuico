// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor;

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
public final class ModuloCarro_ProveCarroSemConstrutorFactory implements Factory<CarroSemConstrutor> {
  @Override
  public CarroSemConstrutor get() {
    return proveCarroSemConstrutor();
  }

  public static ModuloCarro_ProveCarroSemConstrutorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CarroSemConstrutor proveCarroSemConstrutor() {
    return Preconditions.checkNotNullFromProvides(ModuloCarro.INSTANCE.proveCarroSemConstrutor());
  }

  private static final class InstanceHolder {
    private static final ModuloCarro_ProveCarroSemConstrutorFactory INSTANCE = new ModuloCarro_ProveCarroSemConstrutorFactory();
  }
}
