package net.developermaster.kotlincanivetesuico.ui.compose.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentComposeMainBinding
import net.developermaster.kotlincanivetesuico.ui.compose.scaffold.view.Scaffold
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.view.ScaffoldMVVM
import net.developermaster.kotlincanivetesuico.ui.compose.View.Atributos.ComposeAtributos
import net.developermaster.kotlincanivetesuico.ui.compose.View.LazyColumn.ComposeLazyColumn
import net.developermaster.kotlincanivetesuico.ui.compose.View.LazyColumnGrid.ComposeLazyColumnGrid

class FragmentComposeMain : Fragment() {

    //todo binding
    private var _binding: FragmentComposeMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentComposeMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

            //todo chamando compose atributo
            val intent = Intent(activity, ComposeAtributos::class.java)
            startActivity(intent)
        }

        binding.btn02.setOnClickListener {

            //todo chamando compose recyclerview
            val intent = Intent(activity, ComposeLazyColumn::class.java)
            startActivity(intent)
        }

        binding.btn03.setOnClickListener {

            //todo chamando compose recycleview grid
            val intent = Intent(activity, ComposeLazyColumnGrid::class.java)
            startActivity(intent)
        }

        binding.btn04.setOnClickListener {

            //todo chamando compose recycleview grid
            val intent = Intent(activity, Scaffold::class.java)
            startActivity(intent)
        }

        binding.btn05.setOnClickListener {

            //todo chamando compose recycleview grid
            val intent = Intent(activity, ScaffoldMVVM::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}