// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ModuloCarro_ProveBateriaFactory implements Factory<InterfaceInstrumento> {
  @Override
  public InterfaceInstrumento get() {
    return proveBateria();
  }

  public static ModuloCarro_ProveBateriaFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static InterfaceInstrumento proveBateria() {
    return Preconditions.checkNotNullFromProvides(ModuloCarro.INSTANCE.proveBateria());
  }

  private static final class InstanceHolder {
    private static final ModuloCarro_ProveBateriaFactory INSTANCE = new ModuloCarro_ProveBateriaFactory();
  }
}
