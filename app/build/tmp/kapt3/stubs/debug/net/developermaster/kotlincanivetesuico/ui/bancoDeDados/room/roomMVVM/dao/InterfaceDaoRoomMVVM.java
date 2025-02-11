package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/dao/InterfaceDaoRoomMVVM;", "", "atualizar", "", "modelEntidadeRoomMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/modelEntidades/ModelEntidadeRoomMVVM;", "(Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/modelEntidades/ModelEntidadeRoomMVVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletar", "listarId", "", "idPesquisa", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listarIdade", "idadePesquisa", "listarNome", "nomePesquisa", "listarTodos", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "salvar", "app_debug"})
@androidx.room.Dao
public abstract interface InterfaceDaoRoomMVVM {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object salvar(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM modelEntidadeRoomMVVM, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object atualizar(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM modelEntidadeRoomMVVM, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deletar(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM modelEntidadeRoomMVVM, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM nome_da_tabela WHERE id LIKE :idPesquisa")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object listarId(@org.jetbrains.annotations.NotNull
    java.lang.String idPesquisa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE \'%\' || :nomePesquisa || \'%\' ")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object listarNome(@org.jetbrains.annotations.NotNull
    java.lang.String nomePesquisa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE \'%\' || :idadePesquisa || \'%\' ")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object listarIdade(@org.jetbrains.annotations.NotNull
    java.lang.String idadePesquisa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM nome_da_tabela")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object listarTodos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM>> $completion);
}