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
public final class ModuloCarro_ProveViolaoFactory implements Factory<InterfaceInstrumento> {
  @Override
  public InterfaceInstrumento get() {
    return proveViolao();
  }

  public static ModuloCarro_ProveViolaoFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static InterfaceInstrumento proveViolao() {
    return Preconditions.checkNotNullFromProvides(ModuloCarro.INSTANCE.proveViolao());
  }

  private static final class InstanceHolder {
    private static final ModuloCarro_ProveViolaoFactory INSTANCE = new ModuloCarro_ProveViolaoFactory();
  }
}
