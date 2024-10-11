package net.developermaster.kotlincanivetesuico.ui.googleMap.googleMapSimples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentGoogleMapViewBinding
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos


class FragmentMapView : Fragment() {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentGoogleMapViewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGoogleMapViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}