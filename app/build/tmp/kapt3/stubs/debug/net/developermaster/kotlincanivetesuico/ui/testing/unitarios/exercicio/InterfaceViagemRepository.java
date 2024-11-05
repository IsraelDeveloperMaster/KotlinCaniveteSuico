package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.exercicio;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/exercicio/InterfaceViagemRepository;", "", "calcularPrecoViagem", "", "distancia", "precoKM", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listarLocais", "", "Lkotlin/Pair;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface InterfaceViagemRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object listarLocais(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object calcularPrecoViagem(double distancia, double precoKM, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
}