// Generated by data binding compiler. Do not edit!
package net.developermaster.kotlincanivetesuico.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import net.developermaster.kotlincanivetesuico.R;

public abstract class FragmentDatabindingSimples2Binding extends ViewDataBinding {
  @NonNull
  public final EditText userNameEditText;

  @NonNull
  public final TextView userNameTextView;

  @Bindable
  protected String mUser;

  protected FragmentDatabindingSimples2Binding(Object _bindingComponent, View _root,
      int _localFieldCount, EditText userNameEditText, TextView userNameTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.userNameEditText = userNameEditText;
    this.userNameTextView = userNameTextView;
  }

  public abstract void setUser(@Nullable String user);

  @Nullable
  public String getUser() {
    return mUser;
  }

  @NonNull
  public static FragmentDatabindingSimples2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_databinding_simples2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDatabindingSimples2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDatabindingSimples2Binding>inflateInternal(inflater, R.layout.fragment_databinding_simples2, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDatabindingSimples2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_databinding_simples2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDatabindingSimples2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDatabindingSimples2Binding>inflateInternal(inflater, R.layout.fragment_databinding_simples2, null, false, component);
  }

  public static FragmentDatabindingSimples2Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentDatabindingSimples2Binding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentDatabindingSimples2Binding)bind(component, view, R.layout.fragment_databinding_simples2);
  }
}