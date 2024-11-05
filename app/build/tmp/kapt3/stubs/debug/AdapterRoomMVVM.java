
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.ClasseDiffUtilRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"LAdapterRoomMVVM;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LAdapterRoomMVVM$ViewHolder;", "context", "Landroid/content/Context;", "interfaceRoomMVVM", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/adapter/InterfaceRoomMVVM;", "(Landroid/content/Context;Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/adapter/InterfaceRoomMVVM;)V", "getContext", "()Landroid/content/Context;", "listaRetornada", "", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/room/roomMVVM/modelEntidades/ModelEntidadeRoomMVVM;", "atualizaTodaListaDiffUtil", "", "novaLista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "retornaDados", "dadosRetornados", "ViewHolder", "app_debug"})
public final class AdapterRoomMVVM extends androidx.recyclerview.widget.RecyclerView.Adapter<AdapterRoomMVVM.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM interfaceRoomMVVM = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM> listaRetornada;
    
    public AdapterRoomMVVM(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM interfaceRoomMVVM) {
        super();
    }
    
    public final void atualizaTodaListaDiffUtil(@org.jetbrains.annotations.NotNull
    java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM> novaLista) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public AdapterRoomMVVM.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    AdapterRoomMVVM.ViewHolder holder, int position) {
    }
    
    public final void retornaDados(@org.jetbrains.annotations.NotNull
    java.util.List<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM> dadosRetornados) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"LAdapterRoomMVVM$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itensDaView", "Landroid/view/View;", "(LAdapterRoomMVVM;Landroid/view/View;)V", "btnAtualizar", "Landroid/widget/Button;", "getBtnAtualizar", "()Landroid/widget/Button;", "btnDeletar", "getBtnDeletar", "textInputIdade", "Lcom/google/android/material/textfield/TextInputEditText;", "getTextInputIdade", "()Lcom/google/android/material/textfield/TextInputEditText;", "textInputNome", "getTextInputNome", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.google.android.material.textfield.TextInputEditText textInputNome = null;
        @org.jetbrains.annotations.NotNull
        private final com.google.android.material.textfield.TextInputEditText textInputIdade = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.Button btnAtualizar = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.Button btnDeletar = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itensDaView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.android.material.textfield.TextInputEditText getTextInputNome() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.android.material.textfield.TextInputEditText getTextInputIdade() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Button getBtnAtualizar() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Button getBtnDeletar() {
            return null;
        }
    }
}