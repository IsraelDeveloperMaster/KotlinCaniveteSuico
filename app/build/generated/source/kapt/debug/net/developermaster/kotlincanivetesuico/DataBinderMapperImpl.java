package net.developermaster.kotlincanivetesuico;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingComEventoDeCliqueBindingImpl;
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingLivedataViewmodelBindingImpl;
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingSimples2BindingImpl;
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingSimplesBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTDATABINDINGCOMEVENTODECLIQUE = 1;

  private static final int LAYOUT_FRAGMENTDATABINDINGLIVEDATAVIEWMODEL = 2;

  private static final int LAYOUT_FRAGMENTDATABINDINGSIMPLES = 3;

  private static final int LAYOUT_FRAGMENTDATABINDINGSIMPLES2 = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_com_evento_de_clique, LAYOUT_FRAGMENTDATABINDINGCOMEVENTODECLIQUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_livedata_viewmodel, LAYOUT_FRAGMENTDATABINDINGLIVEDATAVIEWMODEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_simples, LAYOUT_FRAGMENTDATABINDINGSIMPLES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_simples2, LAYOUT_FRAGMENTDATABINDINGSIMPLES2);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTDATABINDINGCOMEVENTODECLIQUE: {
          if ("layout/fragment_databinding_com_evento_de_clique_0".equals(tag)) {
            return new FragmentDatabindingComEventoDeCliqueBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_databinding_com_evento_de_clique is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDATABINDINGLIVEDATAVIEWMODEL: {
          if ("layout/fragment_databinding_livedata_viewmodel_0".equals(tag)) {
            return new FragmentDatabindingLivedataViewmodelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_databinding_livedata_viewmodel is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDATABINDINGSIMPLES: {
          if ("layout/fragment_databinding_simples_0".equals(tag)) {
            return new FragmentDatabindingSimplesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_databinding_simples is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDATABINDINGSIMPLES2: {
          if ("layout/fragment_databinding_simples2_0".equals(tag)) {
            return new FragmentDatabindingSimples2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_databinding_simples2 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "eventoClique");
      sKeys.put(2, "name");
      sKeys.put(3, "user");
      sKeys.put(4, "viewmodel");
      sKeys.put(5, "viewmodel2");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_databinding_com_evento_de_clique_0", net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_com_evento_de_clique);
      sKeys.put("layout/fragment_databinding_livedata_viewmodel_0", net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_livedata_viewmodel);
      sKeys.put("layout/fragment_databinding_simples_0", net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_simples);
      sKeys.put("layout/fragment_databinding_simples2_0", net.developermaster.kotlincanivetesuico.R.layout.fragment_databinding_simples2);
    }
  }
}
