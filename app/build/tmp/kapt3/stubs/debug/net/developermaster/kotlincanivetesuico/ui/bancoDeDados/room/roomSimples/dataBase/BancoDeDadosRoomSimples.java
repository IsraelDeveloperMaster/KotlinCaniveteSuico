package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/dataBase/BancoDeDadosRoomSimples;", "Landroidx/room/RoomDatabase;", "()V", "classeDaoRoomSimples", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/dao/InterfaceDaoRoomSimples;", "Companion", "app_debug"})
@androidx.room.Database(entities = {net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples.class}, version = 1)
public abstract class BancoDeDadosRoomSimples extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase.BancoDeDadosRoomSimples.Companion Companion = null;
    
    public BancoDeDadosRoomSimples() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples classeDaoRoomSimples();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/dataBase/BancoDeDadosRoomSimples$Companion;", "", "()V", "recuperarInstanciaRoomSimples", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomSimples/dataBase/BancoDeDadosRoomSimples;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase.BancoDeDadosRoomSimples recuperarInstanciaRoomSimples(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}