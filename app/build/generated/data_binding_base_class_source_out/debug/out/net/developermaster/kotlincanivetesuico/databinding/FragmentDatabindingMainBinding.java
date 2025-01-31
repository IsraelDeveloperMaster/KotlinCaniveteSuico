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

public final class FragmentDatabindingMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btn01;

  @NonNull
  public final Button btn02;

  @NonNull
  public final Button btn03;

  private FragmentDatabindingMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btn01,
      @NonNull Button btn02, @NonNull Button btn03) {
    this.rootView = rootView;
    this.btn01 = btn01;
    this.btn02 = btn02;
    this.btn03 = btn03;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDatabindingMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDatabindingMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_databinding_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDatabindingMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_01;
      Button btn01 = ViewBindings.findChildViewById(rootView, id);
      if (btn01 == null) {
        break missingId;
      }

      id = R.id.btn_02;
      Button btn02 = ViewBindings.findChildViewById(rootView, id);
      if (btn02 == null) {
        break missingId;
      }

      id = R.id.btn_03;
      Button btn03 = ViewBindings.findChildViewById(rootView, id);
      if (btn03 == null) {
        break missingId;
      }

      return new FragmentDatabindingMainBinding((ConstraintLayout) rootView, btn01, btn02, btn03);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
