package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter;

import android.os.Bundle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/adapter/InterfaceRoomMVVM;", "", "funcaoInterfaceRoomMvvmAdicionar", "", "bundle", "Landroid/os/Bundle;", "position", "", "funcaoInterfaceRoomMvvmDeleteNotyfy", "app_debug"})
public abstract interface InterfaceRoomMVVM {
    
    public abstract void funcaoInterfaceRoomMvvmDeleteNotyfy(int position);
    
    public abstract void funcaoInterfaceRoomMvvmAdicionar(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle, int position);
}