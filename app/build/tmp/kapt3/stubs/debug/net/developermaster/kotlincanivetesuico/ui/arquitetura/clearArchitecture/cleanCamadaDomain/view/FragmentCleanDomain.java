package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentCleanDomainBinding;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.repository.RepositorioDomain;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel.ViewModelDomain;
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel.ViewModelFactoryDomain;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.InterfaceCarregando;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/view/FragmentCleanDomain;", "Landroidx/fragment/app/Fragment;", "Lnet/developermaster/kotlincanivetesuico/utils/utilsGeral/InterfaceCarregando;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentCleanDomainBinding;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentCleanDomainBinding;", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "viewModel", "Lnet/developermaster/kotlincanivetesuico/ui/arquitetura/clearArchitecture/cleanCamadaDomain/viewModel/ViewModelDomain;", "codigo", "", "codigoXml", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "progressBar", "carregando", "", "app_debug"})
public final class FragmentCleanDomain extends androidx.fragment.app.Fragment implements net.developermaster.kotlincanivetesuico.utils.utilsGeral.InterfaceCarregando {
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentCleanDomainBinding _binding;
    private net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel.ViewModelDomain viewModel;
    
    public FragmentCleanDomain() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentCleanDomainBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void codigo() {
    }
    
    private final void codigoXml() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void progressBar(boolean carregando) {
    }
}