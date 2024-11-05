package net.developermaster.kotlincanivetesuico.ui.searchView.searchViewListView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentSearchListviewBinding

class FragmentSearchListView() : Fragment() {

    private lateinit var searchView: SearchView

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentSearchListviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSearchListviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    private val listaDeElementos = listOf(
        "Arquiterura",
        "Abas",
        "Activity",
        "Alarm Manager",
        "Alertas", "Api",
        "Banco de Dados",
        "Brodcast Receiver",
        "Componentes de Checagem",
        "Componentes de Listagem",
        "Compose",
        "Coroutine",
        "Fab",
        "Fragmens",
        "Função Lambda",
        "Git",
        "Gps",
        "Hilt",
        "Interface",
        "Menu",
        "Modulo",
        "Permissões",
        "Services",
        "Test",
        "MVC",
        "MVP",
        "MVVM",
        "View Model",
        "LiveData",
        "FireBase",
        "Room",
        "DataBinding",
        "Clean Architecture",
        "Thread",
        "SearchView",
        "ListView",
        "RecyclerView",
        "View Binding"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterListView by lazy {
            ArrayAdapter(requireContext(), android.R.layout.simple_gallery_item, listaDeElementos)
        }
        binding.listView.adapter = adapterListView

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val itemSelecionado = parent.getItemAtPosition(position) as String
            Toast.makeText(requireContext(), " $itemSelecionado", Toast.LENGTH_SHORT).show()

            if (itemSelecionado == "Abas") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Activity") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Alarm Manager") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Alertas") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Api") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Arquiterura") {
//                findNavController().navigate(R.id.fragment_Arquitetura_Main)
            }
            if (itemSelecionado == "Banco de Dados") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Brodcast Receiver") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Componentes de Checagem") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Componentes de Listagem") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Compose") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Coroutine") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Fab") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Fragmens") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Função Lambda") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Git") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Gps") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Hilt") {
//                findNavController().navigate(R.id.fragment_Hilt_Main)
            }
            if (itemSelecionado == "Interface") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Menu") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Modulo") {
//                findNavController().navigate(R.id.fragment_Modulo_Main)
            }
            if (itemSelecionado == "Permissões") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Services") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Test") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "MVC") {
//                findNavController().navigate(R.id.fragment_Mvc)
            }
            if (itemSelecionado == "MVP") {
//                findNavController().navigate(R.id.fragment_Mvp_Main)
            }
            if (itemSelecionado == "MVVM") {
//                findNavController().navigate(R.id.fragment_Mvvm_Main)
            }
            if (itemSelecionado == "View Model") {
//                findNavController().navigate(R.id.fragment_ViewModel_Main)
            }
            if (itemSelecionado == "LiveData") {
//                findNavController().navigate(R.id.fragment_LiveData_Main)
            }
            if (itemSelecionado == "FireBase") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Room") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "DataBinding") {
//                findNavController().navigate(R.id.fragment_DataBinding_Main)
            }
            if (itemSelecionado == "Clean Architecture") {
//                findNavController().navigate(R.id.fragment_Clean_Main)
            }
            if (itemSelecionado == "Thread") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "View Binding") {
//                findNavController().navigate(R.id.fragment_)
            }
            if (itemSelecionado == "RecyclerView") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Toast") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "SnackBar") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "ProgressBar") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "ToolBar") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Spinner") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "CheckBox") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "RealmDB") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Switch") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Material Designer") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Navigation Drawer") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Readme") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "SQLite") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }
            if (itemSelecionado == "Gradle") {
//                findNavController().navigate(R.id.fragment_Codigo)
            }

        }
        // Configura o SearchView
        searchView = binding.searchView
        searchView.queryHint = "Pesquisar"
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                // Aqui você pode executar a ação desejada quando o usuário clica em "search"
                return false
            }

            override fun onQueryTextChange(caixaDeTexto: String?): Boolean {
                // Aqui você pode executar a ação desejada quando o texto da pesquisa é alterado
                adapterListView.filter.filter(caixaDeTexto)
//                adapter.filter.filter(caixaDeTexto)
                return false
            }
        })

        //todo botoes
        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.searchViewListView()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.searchViewListViewXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}