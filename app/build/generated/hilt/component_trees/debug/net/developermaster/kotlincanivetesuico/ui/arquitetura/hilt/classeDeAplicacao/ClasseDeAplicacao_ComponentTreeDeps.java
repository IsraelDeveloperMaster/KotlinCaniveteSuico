package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.classeDeAplicacao;

import dagger.hilt.internal.aggregatedroot.codegen._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_classeDeAplicacao_ClasseDeAplicacao;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_SavedStateHandleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_MainActivity_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_classeDeAplicacao_ClasseDeAplicacao_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyProdutos_viewModel_ViewModelDomainProdutos_HiltModules_BindsModule;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyProdutos_viewModel_ViewModelDomainProdutos_HiltModules_KeyModule;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyProdutos_view_FragmentHiltDummyProdutos_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyUsuarios_viewModel_ViewModelDomainUsuarios_HiltModules_BindsModule;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyUsuarios_viewModel_ViewModelDomainUsuarios_HiltModules_KeyModule;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyUsuarios_view_FragmentHiltDummyUsuarios_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltDependenciasNomeadas_view_FragmentHiltDependenciasNomeadas_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltInjecao_view_FragmentHiltInjecao_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltSimples_modulo_ModuloHiltSimpleBinds;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltSimples_view_FragmentHiltSimples_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_modulosHilt_ModuloApi;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_modulosHilt_ModuloCarro;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_modulosHilt_ModuloInstrumentos;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_compose_scaffoldMVVM_view_ScaffoldMVVM_GeneratedInjector;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_compose_scaffoldMVVM_viewmodel_ViewModelComposeMvvm_HiltModules_BindsModule;
import hilt_aggregated_deps._net_developermaster_kotlincanivetesuico_ui_compose_scaffoldMVVM_viewmodel_ViewModelComposeMvvm_HiltModules_KeyModule;

@ComponentTreeDeps(
    rootDeps = _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_classeDeAplicacao_ClasseDeAplicacao.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_SavedStateHandleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _net_developermaster_kotlincanivetesuico_MainActivity_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_classeDeAplicacao_ClasseDeAplicacao_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyProdutos_viewModel_ViewModelDomainProdutos_HiltModules_BindsModule.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyProdutos_viewModel_ViewModelDomainProdutos_HiltModules_KeyModule.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyProdutos_view_FragmentHiltDummyProdutos_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyUsuarios_viewModel_ViewModelDomainUsuarios_HiltModules_BindsModule.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyUsuarios_viewModel_ViewModelDomainUsuarios_HiltModules_KeyModule.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltClearDomainDummyUsuarios_view_FragmentHiltDummyUsuarios_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltDependenciasNomeadas_view_FragmentHiltDependenciasNomeadas_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltInjecao_view_FragmentHiltInjecao_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltSimples_modulo_ModuloHiltSimpleBinds.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_hiltSimples_view_FragmentHiltSimples_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_modulosHilt_ModuloApi.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_modulosHilt_ModuloCarro.class,
        _net_developermaster_kotlincanivetesuico_ui_arquitetura_hilt_modulosHilt_ModuloInstrumentos.class,
        _net_developermaster_kotlincanivetesuico_ui_compose_scaffoldMVVM_view_ScaffoldMVVM_GeneratedInjector.class,
        _net_developermaster_kotlincanivetesuico_ui_compose_scaffoldMVVM_viewmodel_ViewModelComposeMvvm_HiltModules_BindsModule.class,
        _net_developermaster_kotlincanivetesuico_ui_compose_scaffoldMVVM_viewmodel_ViewModelComposeMvvm_HiltModules_KeyModule.class
    }
)
public final class ClasseDeAplicacao_ComponentTreeDeps {
}
