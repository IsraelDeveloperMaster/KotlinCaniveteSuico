// Generated by view binder compiler. Do not edit!
package net.developermaster.kotlincanivetesuico.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import net.developermaster.kotlincanivetesuico.R;

public final class FragmentArquiteturaMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout ConstraintLayoutArquitetura;

  @NonNull
  public final Button btnCleanArchitecture;

  @NonNull
  public final Button btnDatabindig;

  @NonNull
  public final Button btnHilt;

  @NonNull
  public final Button btnLivedata;

  @NonNull
  public final Button btnMvc;

  @NonNull
  public final Button btnMvp;

  @NonNull
  public final Button btnMvvm;

  @NonNull
  public final Button btnViewModel;

  private FragmentArquiteturaMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout ConstraintLayoutArquitetura, @NonNull Button btnCleanArchitecture,
      @NonNull Button btnDatabindig, @NonNull Button btnHilt, @NonNull Button btnLivedata,
      @NonNull Button btnMvc, @NonNull Button btnMvp, @NonNull Button btnMvvm,
      @NonNull Button btnViewModel) {
    this.rootView = rootView;
    this.ConstraintLayoutArquitetura = ConstraintLayoutArquitetura;
    this.btnCleanArchitecture = btnCleanArchitecture;
    this.btnDatabindig = btnDatabindig;
    this.btnHilt = btnHilt;
    this.btnLivedata = btnLivedata;
    this.btnMvc = btnMvc;
    this.btnMvp = btnMvp;
    this.btnMvvm = btnMvvm;
    this.btnViewModel = btnViewModel;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentArquiteturaMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentArquiteturaMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_arquitetura_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentArquiteturaMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout ConstraintLayoutArquitetura = (ConstraintLayout) rootView;

      id = R.id.btn_clean_architecture;
      Button btnCleanArchitecture = ViewBindings.findChildViewById(rootView, id);
      if (btnCleanArchitecture == null) {
        break missingId;
      }

      id = R.id.btn_databindig;
      Button btnDatabindig = ViewBindings.findChildViewById(rootView, id);
      if (btnDatabindig == null) {
        break missingId;
      }

      id = R.id.btn_hilt;
      Button btnHilt = ViewBindings.findChildViewById(rootView, id);
      if (btnHilt == null) {
        break missingId;
      }

      id = R.id.btn_livedata;
      Button btnLivedata = ViewBindings.findChildViewById(rootView, id);
      if (btnLivedata == null) {
        break missingId;
      }

      id = R.id.btn_mvc;
      Button btnMvc = ViewBindings.findChildViewById(rootView, id);
      if (btnMvc == null) {
        break missingId;
      }

      id = R.id.btn_mvp;
      Button btnMvp = ViewBindings.findChildViewById(rootView, id);
      if (btnMvp == null) {
        break missingId;
      }

      id = R.id.btn_mvvm;
      Button btnMvvm = ViewBindings.findChildViewById(rootView, id);
      if (btnMvvm == null) {
        break missingId;
      }

      id = R.id.btn_view_model;
      Button btnViewModel = ViewBindings.findChildViewById(rootView, id);
      if (btnViewModel == null) {
        break missingId;
      }

      return new FragmentArquiteturaMainBinding((ConstraintLayout) rootView,
          ConstraintLayoutArquitetura, btnCleanArchitecture, btnDatabindig, btnHilt, btnLivedata,
          btnMvc, btnMvp, btnMvvm, btnViewModel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
