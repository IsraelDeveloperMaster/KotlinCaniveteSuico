package net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.developermaster.kotlincanivetesuico.databinding.RecyclerviewTitulosBotoesBinding
import net.developermaster.kotlincanivetesuico.ui.recyclerViewSimples.model.ModelRecyclerViewSimples

class AdapterRecyclerviewSimples(context: Context?, val interfaceRecyclerViewSimples: InterfaceRecyclerViewSimples) :  RecyclerView.Adapter<AdapterRecyclerviewSimples.ViewHolder>() {

    //todo chama o context
    private var mcontext = context

     //todo criando uma lista para o recyclerview
    var listaClasseDeDados_RecyclerViewSimples: List<ModelRecyclerViewSimples> = emptyList()

    //todo metodo que sera chamado na ActivityMain
    @SuppressLint("NotifyDataSetChanged")
    fun carrega_a_lista_dentro_do_recyclerview( lista : List<ModelRecyclerViewSimples> ) {

        listaClasseDeDados_RecyclerViewSimples = lista

        notifyDataSetChanged()
    }

    inner class ViewHolder(layout_recyclerview : RecyclerviewTitulosBotoesBinding) :
        RecyclerView.ViewHolder(layout_recyclerview.root) {

        val binding: RecyclerviewTitulosBotoesBinding

        init {

            binding = layout_recyclerview
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)

        //todo chama o layout do recyclerview
        val recyclerview_itens = RecyclerviewTitulosBotoesBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(recyclerview_itens)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //todo posiciona o itens no recyclerview
        val titulos_e_botoes = listaClasseDeDados_RecyclerViewSimples[position]

//        holder.binding.textViewTitulo.text = titulos_e_botoes.dados_titulo
        holder.binding.botao.text = titulos_e_botoes.dados_botoes

        //todo ao clicar em um item
        holder.binding.botao.setOnClickListener {

            //todo chama o fragment apartir do Int[position]
            if (position == 0 ) {

                //todo chama a interface dentro da main activity
                interfaceRecyclerViewSimples.ANA()
                Toast.makeText(mcontext, " ${titulos_e_botoes.dados_botoes} ", Toast.LENGTH_SHORT).show()
            }

            //todo chama o fragment apartir do Int[position]
            if (position == 1 ) {

                //todo chama a interface dentro da main activity
                interfaceRecyclerViewSimples.CARLOS()
                Toast.makeText(mcontext, " ${titulos_e_botoes.dados_botoes} ", Toast.LENGTH_SHORT).show()
            }

            //todo chama o fragment apartir do Int[position]
            if (position == 2 ) {

                //todo chama a interface dentro da main activity
                interfaceRecyclerViewSimples.MARIA()
                Toast.makeText(mcontext, " ${titulos_e_botoes.dados_botoes} ", Toast.LENGTH_SHORT).show()
            }
/*
            //todo chama o fragment apartir do Int[position]
            if (position == 3 ) {

                //todo chama a interface dentro da main activity
                interfaceRecyclerViewSimples.MVVM()
                Toast.makeText(mcontext, " ${titulos_e_botoes.dados_botoes} ", Toast.LENGTH_SHORT).show()

            }
            */
        }
    }

    override fun getItemCount(): Int {

        //todo enumera a lista
        return listaClasseDeDados_RecyclerViewSimples.size
    }
}