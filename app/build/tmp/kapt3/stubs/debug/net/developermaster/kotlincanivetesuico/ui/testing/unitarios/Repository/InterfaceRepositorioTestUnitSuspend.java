package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository;

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/Repository/InterfaceRepositorioTestUnitSuspend;", "", "metodoListarUsuarioRepositorioTestUnitSuspend", "", "Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/model/ModelTestUnitario;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metodoLogarUsuarioRepositorioTestUnitSuspend", "", "email", "", "senha", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metodoSalvarUsuarioRepositorioTestUnitSuspend", "", "A", "B", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface InterfaceRepositorioTestUnitSuspend {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object metodoLogarUsuarioRepositorioTestUnitSuspend(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String senha, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object metodoListarUsuarioRepositorioTestUnitSuspend(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object metodoSalvarUsuarioRepositorioTestUnitSuspend(int A, int B, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}