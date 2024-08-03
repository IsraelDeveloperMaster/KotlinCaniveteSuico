package net.developermaster.kotlincanivetesuico.ui.SearchView.SearchViewRecyclerView.View

import AdapterSearchRecyclerView
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentSearchRecyclerviewBinding
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.SearchView.SearchViewRecyclerView.Interface.InterfaceSearchRecyclerView
import net.developermaster.kotlincanivetesuico.ui.SearchView.SearchViewRecyclerView.Model.ClasseDeDadosSearchRecyclerView

class FragmentSearchRecyclerView() : Fragment() , InterfaceSearchRecyclerView {

    private lateinit var searchView: SearchView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterSearchRecyclerView
    private lateinit var classeDeDadosSearchRecyclerView: List<ClasseDeDadosFireBaseMVVM>

    //todo instancia de classe onde estao os codigo e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding: FragmentSearchRecyclerviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSearchRecyclerviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaDeBotoes = listOf(
            ClasseDeDadosSearchRecyclerView("Ana" , R.drawable.java),
            ClasseDeDadosSearchRecyclerView("Carlos" , R.drawable.kotlin),
            ClasseDeDadosSearchRecyclerView("Maria" , R.drawable.python)
        )
        // Configura a RecyclerView
        recyclerView = binding.recyclerview
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = AdapterSearchRecyclerView(listaDeBotoes , this)
        recyclerView.adapter = adapter

        // Configura o SearchView
        searchView = binding.searchView
        searchView.queryHint = "Pesquisar"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(textoCaixaPesquisa: String?): Boolean {
                adapter.filter.filter(textoCaixaPesquisa)
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

    override fun ANA() {
//        findNavController().navigate(R.id.fragment_Codigo)
    }

    override fun CARLOS() {
//        findNavController().navigate(R.id.fragment_Codigo)

    }

    override fun MARIA() {
//        findNavController().navigate(R.id.fragment_Codigo)

    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.searchViewRecyclerView()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.searchViewRecyclerViewXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}