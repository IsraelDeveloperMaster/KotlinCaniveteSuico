// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.InterfaceInstrumento;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Musico;

@ScopeMetadata
@QualifierMetadata({
    "javax.inject.Named",
    "dagger.hilt.android.qualifiers.ApplicationContext"
})
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ModuloCarro_ProveMusicoFactory implements Factory<Musico> {
  private final Provider<InterfaceInstrumento> interfaceInstrumentoProvider;

  private final Provider<Context> contextProvider;

  public ModuloCarro_ProveMusicoFactory(Provider<InterfaceInstrumento> interfaceInstrumentoProvider,
      Provider<Context> contextProvider) {
    this.interfaceInstrumentoProvider = interfaceInstrumentoProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public Musico get() {
    return proveMusico(interfaceInstrumentoProvider.get(), contextProvider.get());
  }

  public static ModuloCarro_ProveMusicoFactory create(
      Provider<InterfaceInstrumento> interfaceInstrumentoProvider,
      Provider<Context> contextProvider) {
    return new ModuloCarro_ProveMusicoFactory(interfaceInstrumentoProvider, contextProvider);
  }

  public static Musico proveMusico(InterfaceInstrumento interfaceInstrumento, Context context) {
    return Preconditions.checkNotNullFromProvides(ModuloCarro.INSTANCE.proveMusico(interfaceInstrumento, context));
  }
}