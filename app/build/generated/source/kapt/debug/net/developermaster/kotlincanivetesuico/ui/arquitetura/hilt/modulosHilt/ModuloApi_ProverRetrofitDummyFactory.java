// Generated by Dagger (https://dagger.dev).
package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.modulosHilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import retrofit2.Retrofit;

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
public final class ModuloApi_ProverRetrofitDummyFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return proverRetrofitDummy();
  }

  public static ModuloApi_ProverRetrofitDummyFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit proverRetrofitDummy() {
    return Preconditions.checkNotNullFromProvides(ModuloApi.INSTANCE.proverRetrofitDummy());
  }

  private static final class InstanceHolder {
    private static final ModuloApi_ProverRetrofitDummyFactory INSTANCE = new ModuloApi_ProverRetrofitDummyFactory();
  }
}
