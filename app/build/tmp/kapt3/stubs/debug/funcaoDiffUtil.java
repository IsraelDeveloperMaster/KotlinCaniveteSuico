
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.squareup.picasso.Picasso;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter.ClasseDiffUtilFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter.InterfaceFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel.ViewModelFireBaseMVVM;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a8\u0006\u000b"}, d2 = {"LfuncaoDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lnet/developermaster/kotlincanivetesuico/ui/bancoDeDados/fireBase/fireBaseMVVM/model/ModelFireBaseMVVM;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "itemAntigo", "itemNovo", "app_debug"})
public final class funcaoDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM> {
    
    public funcaoDiffUtil() {
        super();
    }
    
    @java.lang.Override
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM itemAntigo, @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM itemNovo) {
        return false;
    }
    
    @java.lang.Override
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM oldItem, @org.jetbrains.annotations.NotNull
    net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM newItem) {
        return false;
    }
}