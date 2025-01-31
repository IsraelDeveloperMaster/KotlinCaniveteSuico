// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Banda;
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
public final class ModuloInstrumentos_ProverBandaFactory implements Factory<Banda> {
  private final Provider<InterfaceInstrumento> violaoProvider;

  private final Provider<InterfaceInstrumento> bateriaProvider;

  private final Provider<InterfaceInstrumento> guitarraProvider;

  public ModuloInstrumentos_ProverBandaFactory(Provider<InterfaceInstrumento> violaoProvider,
      Provider<InterfaceInstrumento> bateriaProvider,
      Provider<InterfaceInstrumento> guitarraProvider) {
    this.violaoProvider = violaoProvider;
    this.bateriaProvider = bateriaProvider;
    this.guitarraProvider = guitarraProvider;
  }

  @Override
  public Banda get() {
    return proverBanda(violaoProvider.get(), bateriaProvider.get(), guitarraProvider.get());
  }

  public static ModuloInstrumentos_ProverBandaFactory create(
      Provider<InterfaceInstrumento> violaoProvider, Provider<InterfaceInstrumento> bateriaProvider,
      Provider<InterfaceInstrumento> guitarraProvider) {
    return new ModuloInstrumentos_ProverBandaFactory(violaoProvider, bateriaProvider, guitarraProvider);
  }

  public static Banda proverBanda(InterfaceInstrumento violao, InterfaceInstrumento bateria,
      InterfaceInstrumento guitarra) {
    return Preconditions.checkNotNullFromProvides(ModuloInstrumentos.INSTANCE.proverBanda(violao, bateria, guitarra));
  }
}
