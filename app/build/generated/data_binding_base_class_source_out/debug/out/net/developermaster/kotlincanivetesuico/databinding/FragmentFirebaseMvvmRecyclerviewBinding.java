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
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import net.developermaster.kotlincanivetesuico.R;

public final class FragmentFirebaseMvvmRecyclerviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAtualizar;

  @NonNull
  public final Button btnDeletar;

  @NonNull
  public final ShapeableImageView imageViewLayoutRecyclerviewFirebaseMVVM;

  @NonNull
  public final TextInputEditText textInputIdadeFirebaseMVVM;

  @NonNull
  public final TextInputLayout textInputIdadeLayout;

  @NonNull
  public final TextInputEditText textInputNomeFirebaseMVVM;

  @NonNull
  public final TextInputLayout textInputNomeLayout;

  private FragmentFirebaseMvvmRecyclerviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAtualizar, @NonNull Button btnDeletar,
      @NonNull ShapeableImageView imageViewLayoutRecyclerviewFirebaseMVVM,
      @NonNull TextInputEditText textInputIdadeFirebaseMVVM,
      @NonNull TextInputLayout textInputIdadeLayout,
      @NonNull TextInputEditText textInputNomeFirebaseMVVM,
      @NonNull TextInputLayout textInputNomeLayout) {
    this.rootView = rootView;
    this.btnAtualizar = btnAtualizar;
    this.btnDeletar = btnDeletar;
    this.imageViewLayoutRecyclerviewFirebaseMVVM = imageViewLayoutRecyclerviewFirebaseMVVM;
    this.textInputIdadeFirebaseMVVM = textInputIdadeFirebaseMVVM;
    this.textInputIdadeLayout = textInputIdadeLayout;
    this.textInputNomeFirebaseMVVM = textInputNomeFirebaseMVVM;
    this.textInputNomeLayout = textInputNomeLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirebaseMvvmRecyclerviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirebaseMvvmRecyclerviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_firebase_mvvm_recyclerview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirebaseMvvmRecyclerviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAtualizar;
      Button btnAtualizar = ViewBindings.findChildViewById(rootView, id);
      if (btnAtualizar == null) {
        break missingId;
      }

      id = R.id.btnDeletar;
      Button btnDeletar = ViewBindings.findChildViewById(rootView, id);
      if (btnDeletar == null) {
        break missingId;
      }

      id = R.id.imageView_layout_recyclerview_firebaseMVVM;
      ShapeableImageView imageViewLayoutRecyclerviewFirebaseMVVM = ViewBindings.findChildViewById(rootView, id);
      if (imageViewLayoutRecyclerviewFirebaseMVVM == null) {
        break missingId;
      }

      id = R.id.textInput_idade_firebaseMVVM;
      TextInputEditText textInputIdadeFirebaseMVVM = ViewBindings.findChildViewById(rootView, id);
      if (textInputIdadeFirebaseMVVM == null) {
        break missingId;
      }

      id = R.id.textInput_idade_layout;
      TextInputLayout textInputIdadeLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputIdadeLayout == null) {
        break missingId;
      }

      id = R.id.textInput_nome_firebaseMVVM;
      TextInputEditText textInputNomeFirebaseMVVM = ViewBindings.findChildViewById(rootView, id);
      if (textInputNomeFirebaseMVVM == null) {
        break missingId;
      }

      id = R.id.textInput_nome_layout;
      TextInputLayout textInputNomeLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputNomeLayout == null) {
        break missingId;
      }

      return new FragmentFirebaseMvvmRecyclerviewBinding((ConstraintLayout) rootView, btnAtualizar,
          btnDeletar, imageViewLayoutRecyclerviewFirebaseMVVM, textInputIdadeFirebaseMVVM,
          textInputIdadeLayout, textInputNomeFirebaseMVVM, textInputNomeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}