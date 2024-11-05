package net.developermaster.kotlincanivetesuico.ui.home.view

import AdapterHome
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
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentHomeBinding
import net.developermaster.kotlincanivetesuico.ui.home.adapter.InterfaceHome
import net.developermaster.kotlincanivetesuico.ui.home.model.ModelHome
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos

class FragmentHome : Fragment() , InterfaceHome {

    private lateinit var searchView: SearchView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterHome
    private lateinit var modelHome: List<ModelHome>

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        modelHome = listOf(

            ModelHome(getString(R.string.EXT_COMPOSE) , R.drawable.java),
            ModelHome(getString(R.string.EXT_FIREBASE) , R.drawable.java),
            ModelHome(getString(R.string.EXT_ROOM) , R.drawable.java),
            ModelHome(getString(R.string.EXT_SEARCHVIEW) , R.drawable.java),
            ModelHome(getString(R.string.EXT_MVC) , R.drawable.java),
            ModelHome(getString(R.string.EXT_MVP) , R.drawable.java),
            ModelHome(getString(R.string.EXT_VIEWMODEL) , R.drawable.java),
            ModelHome(getString(R.string.EXT_LIVEDATA) , R.drawable.java),
            ModelHome(getString(R.string.EXT_DATABINDING) , R.drawable.java),
            ModelHome(getString(R.string.EXT_MVVM) , R.drawable.java),
            ModelHome(getString(R.string.EXT_CLEAN_ARCHITECTURE) , R.drawable.java),
            ModelHome(getString(R.string.EXT_HILT) , R.drawable.java),
            ModelHome(getString(R.string.EXT_TEST) , R.drawable.java),
            ModelHome(getString(R.string.EXT_GOOGLE_MAP) , R.drawable.java),
            ModelHome(getString(R.string.EXT_SERVICES_BACKGROUND) , R.drawable.java),
            ModelHome(getString(R.string.EXT_FLOW) , R.drawable.java)
        )

        // Configura a RecyclerView
        recyclerView = binding.recyclerviewHome
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = AdapterHome(modelHome, this)
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
    }
    ////////////////////////// COMPOSE //////////////////////////////////////
    override fun COMPOSE() {
        findNavController().navigate(R.id.fragment_Compose_Main) }
    ////////////////////////// COMPOSE //////////////////////////////////////


    ////////////////////////// FIREBASE //////////////////////////////////////
    override fun FIREBASE() {
        findNavController().navigate(R.id.fragment_FireBase_Main) }
    ////////////////////////// FIREBASE //////////////////////////////////////


    ////////////////////////// ROOM //////////////////////////////////////
    override fun ROOM() {
        findNavController().navigate(R.id.fragment_Room_Main) }
    ////////////////////////// ROOM //////////////////////////////////////


    ////////////////////////// SEARCHVIEW //////////////////////////////////////
    override fun SEARCHVIEW() {
        findNavController().navigate(R.id.fragment_SearchView_Main) }
    ////////////////////////// SEARCHVIEW //////////////////////////////////////


    ////////////////////////// FRAGMENT //////////////////////////////////////
    override fun FRAGMENT() {
        findNavController().navigate(R.id.fragment_Fragment_Main) }
    ////////////////////////// FRAGMENT //////////////////////////////////////


    ////////////////////////// ARQUITETURA //////////////////////////////////////
    override fun ARQUITETURA() {
findNavController().navigate(R.id.fragment_Arquitetura_Main) }
    ////////////////////////// ARQUITETURA //////////////////////////////////////


    ////////////////////////// MVC //////////////////////////////////////
    override fun MVC() {
        findNavController().navigate(R.id.fragment_Mvc) }
    ////////////////////////// MVC //////////////////////////////////////


    ////////////////////////// MVP //////////////////////////////////////
    override fun MVP() {
        findNavController().navigate(R.id.fragment_Mvp_Main) }
    ////////////////////////// MVP //////////////////////////////////////


    ////////////////////////// VIEWMODEL //////////////////////////////////////
    override fun VIEWMODEL() {
        findNavController().navigate(R.id.fragment_ViewModel_Main) }
    ////////////////////////// VIEWMODEL //////////////////////////////////////


    ////////////////////////// LIVEDATA //////////////////////////////////////
    override fun LIVEDATA() {
        findNavController().navigate(R.id.fragment_LiveData_Main) }
    ////////////////////////// LIVEDATA //////////////////////////////////////


    ////////////////////////// DATABINDING //////////////////////////////////////
    override fun DATABINDING() {
        findNavController().navigate(R.id.fragment_DataBinding_Main) }
    ////////////////////////// DATABINDING //////////////////////////////////////


    ////////////////////////// MVVM //////////////////////////////////////
    override fun MVVM() {
        findNavController().navigate(R.id.fragment_Mvvm_Main) }
    ////////////////////////// MVVM //////////////////////////////////////


    ////////////////////////// CLEAN //////////////////////////////////////
    override fun CLEAN() {
        findNavController().navigate(R.id.fragment_Clean_Main) }
    ////////////////////////// CLEAN //////////////////////////////////////


    ////////////////////////// HILT //////////////////////////////////////
    override fun HILT() {
        findNavController().navigate(R.id.fragment_Hilt_Main) }
    ////////////////////////// HILT //////////////////////////////////////


    ////////////////////////// TEST //////////////////////////////////////
    override fun TEST() {
        findNavController().navigate(R.id.fragment_Test_Main) }
    ////////////////////////// TEST //////////////////////////////////////


    ////////////////////////// GOOGLEMAP //////////////////////////////////////
    override fun GOOGLEMAP() {
        findNavController().navigate(R.id.fragment_GoogleMap_Main) }
    ////////////////////////// GOOGLEMAP //////////////////////////////////////


    ////////////////////////// SERVICES //////////////////////////////////////
    override fun SERVICESBACKGROUND() {
        findNavController().navigate(R.id.fragment_ServicesBackGround_Main) }
    ////////////////////////// SERVICES //////////////////////////////////////


    ////////////////////////// FLOW //////////////////////////////////////
    override fun FLOW() {
        findNavController().navigate(R.id.fragment_Flow_Main) }
    ////////////////////////// FLOW //////////////////////////////////////

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvc()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}