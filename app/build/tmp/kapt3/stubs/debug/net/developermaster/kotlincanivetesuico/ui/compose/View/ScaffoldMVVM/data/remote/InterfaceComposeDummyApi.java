package net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.remote;

import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.UsuariosComposeDummyApi;
import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/compose/View/ScaffoldMVVM/data/remote/InterfaceComposeDummyApi;", "", "recuperarUsuariosDummyApi", "Lretrofit2/Response;", "Lnet/developermaster/kotlincanivetesuico/ui/compose/scaffoldMVVM/di/UsuariosComposeDummyApi;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface InterfaceComposeDummyApi {
    
    @retrofit2.http.GET(value = "users")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object recuperarUsuariosDummyApi(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.UsuariosComposeDummyApi>> $completion);
}