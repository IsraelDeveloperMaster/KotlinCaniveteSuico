
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.adapter.InterfaceSearchRecyclerView;
import net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"LAdapterSearchRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LAdapterSearchRecyclerView$ViewHolder;", "Landroid/widget/Filterable;", "modelSearchRecyclerView", "", "Lnet/developermaster/kotlincanivetesuico/ui/searchView/searchViewRecyclerView/model/ModelSearchRecyclerView;", "interfaceSearchRecyclerView", "Lnet/developermaster/kotlincanivetesuico/ui/searchView/searchViewRecyclerView/adapter/InterfaceSearchRecyclerView;", "(Ljava/util/List;Lnet/developermaster/kotlincanivetesuico/ui/searchView/searchViewRecyclerView/adapter/InterfaceSearchRecyclerView;)V", "filtro", "getInterfaceSearchRecyclerView", "()Lnet/developermaster/kotlincanivetesuico/ui/searchView/searchViewRecyclerView/adapter/InterfaceSearchRecyclerView;", "getModelSearchRecyclerView", "()Ljava/util/List;", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdapterSearchRecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<AdapterSearchRecyclerView.ViewHolder> implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView> modelSearchRecyclerView = null;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.adapter.InterfaceSearchRecyclerView interfaceSearchRecyclerView = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView> filtro;
    
    public AdapterSearchRecyclerView(@org.jetbrains.annotations.NotNull
    java.util.List<net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView> modelSearchRecyclerView, @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.adapter.InterfaceSearchRecyclerView interfaceSearchRecyclerView) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView> getModelSearchRecyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.adapter.InterfaceSearchRecyclerView getInterfaceSearchRecyclerView() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public AdapterSearchRecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    AdapterSearchRecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"LAdapterSearchRecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "botao", "Landroid/widget/Button;", "bind", "", "modelSearchRecyclerView", "Lnet/developermaster/kotlincanivetesuico/ui/searchView/searchViewRecyclerView/model/ModelSearchRecyclerView;", "interfaceSearchRecyclerView", "Lnet/developermaster/kotlincanivetesuico/ui/searchView/searchViewRecyclerView/adapter/InterfaceSearchRecyclerView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.Button botao = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView modelSearchRecyclerView, @org.jetbrains.annotations.NotNull
        net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.adapter.InterfaceSearchRecyclerView interfaceSearchRecyclerView) {
        }
    }
}