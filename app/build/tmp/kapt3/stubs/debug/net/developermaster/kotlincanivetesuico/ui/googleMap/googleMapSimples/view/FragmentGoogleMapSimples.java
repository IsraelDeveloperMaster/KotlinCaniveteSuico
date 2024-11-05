package net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.view;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CustomCap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import net.developermaster.kotlincanivetesuico.R;
import net.developermaster.kotlincanivetesuico.databinding.FragmentGoogleMapSimplesBinding;
import net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.classes.ModelLugares;
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u000204H\u0016J-\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u0002072\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020:092\u0006\u0010;\u001a\u00020<H\u0016\u00a2\u0006\u0002\u0010=J\u001a\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010@\u001a\u00020\u001bH\u0002J\b\u0010A\u001a\u000201H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006C"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/googleMap/googleMapSimples/view/FragmentGoogleMapSimples;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationClickListener;", "()V", "_binding", "Lnet/developermaster/kotlincanivetesuico/databinding/FragmentGoogleMapSimplesBinding;", "binding", "getBinding", "()Lnet/developermaster/kotlincanivetesuico/databinding/FragmentGoogleMapSimplesBinding;", "dados", "Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "getDados", "()Lnet/developermaster/kotlincanivetesuico/utils/codigos/modelCodigos;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "marcadorNovo", "Lcom/google/android/gms/maps/model/LatLng;", "modelLugares", "Lnet/developermaster/kotlincanivetesuico/ui/googleMap/googleMapSimples/classes/ModelLugares;", "pattern", "", "Lcom/google/android/gms/maps/model/PatternItem;", "getPattern", "()Ljava/util/List;", "codigo", "", "codigoXml", "criandoDesenhos", "criandoMarcadores", "criandoMarcadoresNovo", "latitudeLongitude", "funcaoChamaFragmentGoogleMap", "habilitandoLocalizacao", "mundaCorPolylineRandom", "polyline", "Lcom/google/android/gms/maps/model/Polyline;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onMapReady", "onMyLocationButtonClick", "", "onMyLocationClick", "localizacao", "Landroid/location/Location;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "verificaPermissaoLocalizacao", "verificaPermissaoUsuario", "Companion", "app_debug"})
public final class FragmentGoogleMapSimples extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener, com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener {
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.maps.model.LatLng marcadorNovo;
    private net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.classes.ModelLugares modelLugares;
    private com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.google.android.gms.maps.model.PatternItem> pattern = null;
    public static final int REQUEST_CODE_LOCATION = 0;
    @org.jetbrains.annotations.NotNull
    private final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos dados = null;
    @org.jetbrains.annotations.Nullable
    private net.developermaster.kotlincanivetesuico.databinding.FragmentGoogleMapSimplesBinding _binding;
    @org.jetbrains.annotations.NotNull
    public static final net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples.view.FragmentGoogleMapSimples.Companion Companion = null;
    
    public FragmentGoogleMapSimples() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() {
        return null;
    }
    
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void criandoMarcadoresNovo(com.google.android.gms.maps.model.LatLng latitudeLongitude) {
    }
    
    private final void criandoDesenhos() {
    }
    
    private final void criandoMarcadores() {
    }
    
    private final boolean verificaPermissaoUsuario() {
        return false;
    }
    
    private final void habilitandoLocalizacao() {
    }
    
    private final void verificaPermissaoLocalizacao() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public boolean onMyLocationButtonClick() {
        return false;
    }
    
    @java.lang.Override
    public void onMyLocationClick(@org.jetbrains.annotations.NotNull
    android.location.Location localizacao) {
    }
    
    public final void mundaCorPolylineRandom(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.model.Polyline polyline) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos getDados() {
        return null;
    }
    
    private final net.developermaster.kotlincanivetesuico.databinding.FragmentGoogleMapSimplesBinding getBinding() {
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
    
    private final void funcaoChamaFragmentGoogleMap() {
    }
    
    private final void codigo() {
    }
    
    private final void codigoXml() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lnet/developermaster/kotlincanivetesuico/ui/googleMap/googleMapSimples/view/FragmentGoogleMapSimples$Companion;", "", "()V", "REQUEST_CODE_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}