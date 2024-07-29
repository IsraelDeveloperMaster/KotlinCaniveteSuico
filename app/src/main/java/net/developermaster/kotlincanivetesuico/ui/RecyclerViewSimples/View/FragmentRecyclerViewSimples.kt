package net.developermaster.kotlincanivetesuico.ui.RecyclerViewSimples.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.databinding.FragmentRecyclerviewSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.RecyclerViewSimples.Adapter.AdapterRecyclerviewSimples
import net.developermaster.kotlincanivetesuico.ui.RecyclerViewSimples.Interface.InterfaceRecyclerViewSimples
import net.developermaster.kotlincanivetesuico.ui.RecyclerViewSimples.Model.ClasseDeDadosRecyclerViewSimples

class FragmentRecyclerViewSimples  ( ) : Fragment(  ) , InterfaceRecyclerViewSimples {

    //todo chama o adapter
    private var adapter_recyclerview : AdapterRecyclerviewSimples? = null

    //todo chama o binding como null
    private var _binding: FragmentRecyclerviewSimplesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        //todo chama o binding
        _binding = FragmentRecyclerviewSimplesBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo chama o recyclerView
        adapter_recyclerview = AdapterRecyclerviewSimples ( context , this)
        val recyclerView: RecyclerView = binding.idRecyclerview
        recyclerView.layoutManager = LinearLayoutManager( context )

        //todo linha divisoria do recyclerview
        recyclerView.addItemDecoration( DividerItemDecoration ( context, RecyclerView.VERTICAL ) )

        //todo chama o adapter
        recyclerView.adapter =  adapter_recyclerview
    }

    //todo funcao para atualizar a lista
    private fun funcao_que_atualiza_lista (  ) {

        //todo de botoes recyclerview
        val lista_de_titulos_e_botoes = listOf(

            ClasseDeDadosRecyclerViewSimples ( "" , "Ana" ) ,//todo position " 0 "
            ClasseDeDadosRecyclerViewSimples ( "" , "Carlos" ) ,//todo position " 1 "
            ClasseDeDadosRecyclerViewSimples ( "" , "Maria" ) ,//todo position " 2 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.MAIN_MVVM_API ) ) ,//todo position " 3 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.COMPENENTES_DE_CHECAGEM ) ) ,//todo position " 4 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.COMPENENTES_DE_LISTAGEM ) ) ,//todo position " 5 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.ALERTAS ) ) ,//todo position " 6 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.BANCO_DE_DADOS ) ) ,//todo position " 7 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.API ) ) ,//todo position " 8 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.COUROTINES ) ) ,//todo position " 9 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.MENU ) ) ,//todo position " 10 "
//            ClasseDeDadosRecyclerViewSimples ( "" , getString( R.string.FAB ) ) ,//todo position " 11 "
        )

        adapter_recyclerview?.carrega_a_lista_dentro_do_recyclerview( lista_de_titulos_e_botoes )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onStart() {
        super.onStart()
        //todo lista a lista do recyclerview no ciclo de vida ON START
        funcao_que_atualiza_lista()
    }

    //todo executa um acao dentro da main activity , apartir de uma interface
    override fun ANA() {

        mensagemToast("Nome Ana Clicado")

        mensagemSnackBar("Nome Ana Clicado")
    }

    override fun CARLOS() {

        mensagemToast("Nome Carlos Clicado")

        mensagemSnackBar("Nome Carlos Clicado")
    }

    override fun MARIA() {

        mensagemToast("Nome Maria Clicado")

        mensagemSnackBar("Nome Maria Clicado")
    }
}

