package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository;

import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/Repository/InterfaceRepositorioTestUnit;", "", "metodoListarUsuarioRepositorioTestUnit", "", "Lnet/developermaster/kotlincanivetesuico/ui/testing/unitarios/model/ModelTestUnitario;", "metodoLogarUsuarioRepositorioTestUnit", "", "email", "", "senha", "app_debug"})
public abstract interface InterfaceRepositorioTestUnit {
    
    public abstract boolean metodoLogarUsuarioRepositorioTestUnit(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String senha);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario> metodoListarUsuarioRepositorioTestUnit();
}