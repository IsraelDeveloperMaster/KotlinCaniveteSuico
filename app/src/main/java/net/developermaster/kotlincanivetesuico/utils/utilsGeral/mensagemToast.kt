package net.developermaster.kotlincanivetesuico.utils.utilsGeral

import android.util.TypedValue
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun Fragment.mensagemToast(mensagem: String ) {

    //todo view
    view?.let { view ->

        //todo exibe a mensagem
        val toast = Toast.makeText(context, mensagem, Toast.LENGTH_SHORT)

        //todo variavel view
        val toastView = toast.view

        // todo cor de fundo
        if (toastView != null) {
            toastView.setBackgroundColor(ContextCompat.getColor(requireContext(), com.google.android.material.R.color.design_default_color_on_secondary))
        }

        // todo estilo do texto
        val toastText = toastView?.findViewById<TextView>(android.R.id.message)
        if (toastText != null) {

            //todo color do texto
            toastText.setTextColor( (ContextCompat.getColor(requireContext(), com.google.android.material.R.color.design_default_color_on_primary) ))

            //todo tamanho do texto
            toastText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
        }

        //todo exibe variavel mensagem
//        toast.setView(toastView)

        //todo posicao
        toast.setGravity(Gravity.CENTER, 0, 0)

        //todo Mostra o mensagem
        toast.show()
    }
}

