package net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.Dispatchers;
import net.developermaster.kotlincanivetesuico.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround;", "Landroid/app/Service;", "()V", "coroutine", "Lkotlinx/coroutines/CoroutineScope;", "cronometro", "", "getCronometro", "()I", "setCronometro", "(I)V", "onBind", "Landroid/os/IBinder;", "servicos", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "intent", "flags", "startId", "MinhaThread", "MyBinder", "app_debug"})
public final class ServicesClassForeGround extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutine = null;
    private int cronometro = 0;
    
    public ServicesClassForeGround() {
        super();
    }
    
    public final int getCronometro() {
        return 0;
    }
    
    public final void setCronometro(int p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent servicos) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround$MinhaThread;", "Ljava/lang/Thread;", "(Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround;)V", "run", "", "app_debug"})
    public final class MinhaThread extends java.lang.Thread {
        
        public MinhaThread() {
            super();
        }
        
        @java.lang.Override()
        public void run() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround$MyBinder;", "Landroid/os/Binder;", "(Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround;)V", "recuperarService", "Lnet/developermaster/kotlincanivetesuico/ui/services/serviceForeGround/classes/ServicesClassForeGround;", "app_debug"})
    public final class MyBinder extends android.os.Binder {
        
        public MyBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.ServicesClassForeGround recuperarService() {
            return null;
        }
    }
}