package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.presenter;

import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.model.ModelJsonPlaceHolderMvpApi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/mvp/mvpApi/presenter/InterfacePresenterPostagemJsonPlaceHolderMvpApi;", "", "exibirUsuariosApartirDaInterfacePresenter", "", "lista", "", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/mvp/mvpApi/model/ModelJsonPlaceHolderMvpApi;", "progressBar", "carregando", "", "app_debug"})
public abstract interface InterfacePresenterPostagemJsonPlaceHolderMvpApi {
    
    public abstract void exibirUsuariosApartirDaInterfacePresenter(@org.jetbrains.annotations.NotNull
    java.util.List<net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.model.ModelJsonPlaceHolderMvpApi> lista);
    
    public abstract void progressBar(boolean carregando);
}