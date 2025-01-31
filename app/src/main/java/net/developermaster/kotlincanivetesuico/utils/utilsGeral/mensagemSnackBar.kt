package net.developermaster.kotlincanivetesuico.utils.utilsGeral

import android.util.TypedValue
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

fun Fragment.mensagemSnackBar(mensagem: String) {

    //todo variavel view
    view?.let {view ->

        //todo exibe a mensagem
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)

        // todo cor de fundo
        val customSnackBar = snackbar.view
        customSnackBar.setBackgroundColor(ContextCompat.getColor(requireContext(), com.google.android.material.R.color.design_default_color_on_background))

        // todo estilo do texto
        val textView = customSnackBar.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)

        //todo color do texto
        textView.setTextColor(ContextCompat.getColor(requireContext(), com.google.android.material.R.color.design_default_color_on_primary))

        //todo tamanho do texto
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
        snackbar.show()
    }
}

