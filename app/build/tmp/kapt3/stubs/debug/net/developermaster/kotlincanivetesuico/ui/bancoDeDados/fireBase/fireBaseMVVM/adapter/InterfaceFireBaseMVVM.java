package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter;

import android.os.Bundle;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/adapter/InterfaceFireBaseMVVM;", "", "funcaoInterfaceFireBaseMvvmAdicionar", "", "bundle", "Landroid/os/Bundle;", "position", "", "funcaoInterfaceFireBaseMvvmDeleteNotyfy", "funcaoInterfaceFireBaseMvvmListarImagensNotyfy", "funcaoInterfaceFireBaseMvvmSalvarImagemAdapter", "modelFireBaseMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/model/ModelFireBaseMVVM;", "app_debug"})
public abstract interface InterfaceFireBaseMVVM {
    
    public abstract void funcaoInterfaceFireBaseMvvmListarImagensNotyfy();
    
    public abstract void funcaoInterfaceFireBaseMvvmDeleteNotyfy(int position);
    
    public abstract void funcaoInterfaceFireBaseMvvmSalvarImagemAdapter(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM modelFireBaseMVVM);
    
    public abstract void funcaoInterfaceFireBaseMvvmAdicionar(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle, int position);
}