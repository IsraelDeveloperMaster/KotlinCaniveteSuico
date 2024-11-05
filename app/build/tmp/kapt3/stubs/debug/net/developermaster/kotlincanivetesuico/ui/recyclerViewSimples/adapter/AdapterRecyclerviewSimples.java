package net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import net.developermaster.kotlincanivetesuico.databinding.RecyclerviewTitulosBotoesBinding;
import net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.model.ModelRecyclerViewSimples;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/AdapterRecyclerviewSimples;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/AdapterRecyclerviewSimples$ViewHolder;", "context", "Landroid/content/Context;", "interfaceRecyclerViewSimples", "Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/InterfaceRecyclerViewSimples;", "(Landroid/content/Context;Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/InterfaceRecyclerViewSimples;)V", "getInterfaceRecyclerViewSimples", "()Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/InterfaceRecyclerViewSimples;", "listaClasseDeDados_RecyclerViewSimples", "", "Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/model/ModelRecyclerViewSimples;", "getListaClasseDeDados_RecyclerViewSimples", "()Ljava/util/List;", "setListaClasseDeDados_RecyclerViewSimples", "(Ljava/util/List;)V", "mcontext", "carrega_a_lista_dentro_do_recyclerview", "", "lista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdapterRecyclerviewSimples extends androidx.recyclerview.widget.RecyclerView.Adapter<net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter.AdapterRecyclerviewSimples.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter.InterfaceRecyclerViewSimples interfaceRecyclerViewSimples = null;
    @org.jetbrains.annotations.Nullable
    private android.content.Context mcontext;
    @org.jetbrains.annotations.NotNull
    private java.util.List<net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.model.ModelRecyclerViewSimples> listaClasseDeDados_RecyclerViewSimples;
    
    public AdapterRecyclerviewSimples(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter.InterfaceRecyclerViewSimples interfaceRecyclerViewSimples) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter.InterfaceRecyclerViewSimples getInterfaceRecyclerViewSimples() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.model.ModelRecyclerViewSimples> getListaClasseDeDados_RecyclerViewSimples() {
        return null;
    }
    
    public final void setListaClasseDeDados_RecyclerViewSimples(@org.jetbrains.annotations.NotNull
    java.util.List<net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.model.ModelRecyclerViewSimples> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void carrega_a_lista_dentro_do_recyclerview(@org.jetbrains.annotations.NotNull
    java.util.List<net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.model.ModelRecyclerViewSimples> lista) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter.AdapterRecyclerviewSimples.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter.AdapterRecyclerviewSimples.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/AdapterRecyclerviewSimples$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout_recyclerview", "Lnet/developermaster/kotlincanivetesuico/databinding/RecyclerviewTitulosBotoesBinding;", "(Lnet/developermaster/kotlincanivetesuico/ui/recyclerViewSimples/adapter/AdapterRecyclerviewSimples;Lnet/developermaster/kotlincanivetesuico/databinding/RecyclerviewTitulosBotoesBinding;)V", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/RecyclerviewTitulosBotoesBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final net.developermaster.kotlincanivetesuico.databinding.RecyclerviewTitulosBotoesBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        net.developermaster.kotlincanivetesuico.databinding.RecyclerviewTitulosBotoesBinding layout_recyclerview) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final net.developermaster.kotlincanivetesuico.databinding.RecyclerviewTitulosBotoesBinding getBinding() {
            return null;
        }
    }
}