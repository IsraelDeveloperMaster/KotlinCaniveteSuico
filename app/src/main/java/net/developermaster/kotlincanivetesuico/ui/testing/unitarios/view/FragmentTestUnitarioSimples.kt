package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.developermaster.kotlincanivetesuico.databinding.FragmentTestUnitarioSimplesBinding
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FragmentTestUnitarioSimples : Fragment() {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentTestUnitarioSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTestUnitarioSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    fun metodoLogarUsuario ( email: String, senha: String ) : Boolean {
        return true
    }

    fun calculaSoma(a: Int, b: Int): Int {
        return a + b
    }

    fun calcularDesconto( salario: Double, desconto: Double ) : Double {
        return salario - desconto
    }

   fun metodoSomar( numero1: Int, numero2: Int ) : Int {
       return numero1 + numero2
   }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvc()}")
        }

//        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

//        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
//        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}