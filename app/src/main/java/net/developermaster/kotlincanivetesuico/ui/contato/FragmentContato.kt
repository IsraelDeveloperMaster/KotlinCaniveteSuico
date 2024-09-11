package net.developermaster.kotlincanivetesuico.ui.contato

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentContatoBinding

class FragmentContato : Fragment() {

    //todo binding
    private var _binding: FragmentContatoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentContatoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

            contatoWhatsApp()
        }

        binding.btn02.setOnClickListener {

            contatoEmail()
        }
    }

    private fun contatoEmail() {

        val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:")
            putExtra(Intent.EXTRA_EMAIL, arrayOf("dev@developermaster.net"))
            putExtra(Intent.EXTRA_SUBJECT, "App Kotlin Canivete Suiço")
            putExtra(Intent.EXTRA_TEXT, "Óla, Israel me chamo: ")
        }
        startActivity(Intent.createChooser(emailIntent, "Enviar e-mail"))
    }

    private fun contatoWhatsApp() {

        val message = "Olá, Israel me chamo: " //todo mensagem

        val phoneNumber = "34663593864" //todo numero de telefone

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/$phoneNumber/?text=$message"))

        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}