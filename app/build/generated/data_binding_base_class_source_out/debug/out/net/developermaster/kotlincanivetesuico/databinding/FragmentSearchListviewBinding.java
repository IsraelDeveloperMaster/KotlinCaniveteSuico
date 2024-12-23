// Generated by view binder compiler. Do not edit!
package net.developermaster.kotlincanivetesuico.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import net.developermaster.kotlincanivetesuico.R;

public final class FragmentSearchListviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fabCodigo;

  @NonNull
  public final FloatingActionButton fabXml;

  @NonNull
  public final ListView listView;

  @NonNull
  public final SearchView searchView;

  private FragmentSearchListviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fabCodigo, @NonNull FloatingActionButton fabXml,
      @NonNull ListView listView, @NonNull SearchView searchView) {
    this.rootView = rootView;
    this.fabCodigo = fabCodigo;
    this.fabXml = fabXml;
    this.listView = listView;
    this.searchView = searchView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchListviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchListviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search_listview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchListviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fabCodigo;
      FloatingActionButton fabCodigo = ViewBindings.findChildViewById(rootView, id);
      if (fabCodigo == null) {
        break missingId;
      }

      id = R.id.fabXml;
      FloatingActionButton fabXml = ViewBindings.findChildViewById(rootView, id);
      if (fabXml == null) {
        break missingId;
      }

      id = R.id.listView;
      ListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      return new FragmentSearchListviewBinding((ConstraintLayout) rootView, fabCodigo, fabXml,
          listView, searchView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
