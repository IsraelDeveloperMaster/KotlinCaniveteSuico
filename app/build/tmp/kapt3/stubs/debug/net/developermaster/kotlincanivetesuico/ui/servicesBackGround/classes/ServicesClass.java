package net.developermaster.kotlincanivetesuico.ui.servicesBackGround.classes;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import kotlinx.coroutines.GlobalScope;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\"\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/servicesBackGround/classes/ServicesClass;", "Landroid/app/Service;", "()V", "onBind", "Landroid/os/IBinder;", "servicos", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "flags", "startId", "MinhaThread", "app_debug"})
public final class ServicesClass extends android.app.Service {
    
    public ServicesClass() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent servicos) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/servicesBackGround/classes/ServicesClass$MinhaThread;", "Ljava/lang/Thread;", "(Lnet/developermaster/kotlincanivetesuico/ui/servicesBackGround/classes/ServicesClass;)V", "run", "", "app_debug"})
    public final class MinhaThread extends java.lang.Thread {
        
        public MinhaThread() {
            super();
        }
        
        @java.lang.Override
        public void run() {
        }
    }
}