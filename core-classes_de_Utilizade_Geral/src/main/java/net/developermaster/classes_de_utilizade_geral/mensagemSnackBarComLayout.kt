package net.developermaster.classes_de_utilizade_geral

import android.util.TypedValue
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar


fun Fragment.mensagemSnackBarComLayout ( mensagem: String ){

    view?.let {view ->

        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)

        val customSnackBar = snackbar.view
        customSnackBar.setBackgroundColor(ContextCompat.getColor(requireContext(), com.google.android.material.R.color.design_default_color_on_secondary))
        val textView = customSnackBar.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        textView.setTextColor(ContextCompat.getColor(requireContext(), com.google.android.material.R.color.design_default_color_on_primary))
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
        snackbar.show()
    }
}

