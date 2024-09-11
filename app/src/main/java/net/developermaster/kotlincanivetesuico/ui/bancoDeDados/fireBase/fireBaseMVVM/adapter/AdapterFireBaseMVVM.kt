
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.squareup.picasso.Picasso
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter.ClasseDiffUtilFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter.InterfaceFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel.ViewModelFireBaseMVVM

class AdapterFireBaseMVVM(private val interfaceFireBaseMVVM: InterfaceFireBaseMVVM) :
    RecyclerView.Adapter<AdapterFireBaseMVVM.ViewHolder>() {

    //todo atualiza a lista DiffUtil
    fun atualizaTodaListaDiffUtil( novaLista: List<ModelFireBaseMVVM>) {

        val diffResult = DiffUtil.calculateDiff(ClasseDiffUtilFireBaseMVVM( listaRetornada, novaLista))

        listaRetornada = novaLista

        diffResult.dispatchUpdatesTo(this)
    }

    //todo lista de dados
    private var listaRetornada: List<ModelFireBaseMVVM> = emptyList()

    inner class ViewHolder(itensDaView: View) : RecyclerView.ViewHolder(itensDaView) {

        val imageView: ImageView = itensDaView.findViewById(R.id.imageView_layout_recyclerview_firebaseMVVM)
        val textInputNome: TextInputEditText = itensDaView.findViewById(R.id.textInput_nome_firebaseMVVM)
        val textInputIdade: TextInputEditText = itensDaView.findViewById(R.id.textInput_idade_firebaseMVVM)
        val btnAtualizar: Button = itensDaView.findViewById(R.id.btnAtualizar)
        val btnDeletar: Button = itensDaView.findViewById(R.id.btnDeletar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_firebase_mvvm_recyclerview, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val classeDeDadosFireBaseMVVM = listaRetornada[position]

        if (classeDeDadosFireBaseMVVM.foto.isEmpty()) {

            holder.imageView.setImageResource(R.drawable.ic_canivete)

            println("adapterFireBaseMVVM listar fotos nulo -> ${classeDeDadosFireBaseMVVM.foto}")

        } else  {

            //todo carrega a imagem
            Picasso.get()
                .load( classeDeDadosFireBaseMVVM.foto )
                .into(holder.imageView)

            println("adapterFireBaseMVVM listar fotos nao nulo -> ${classeDeDadosFireBaseMVVM.foto}")
        }


        holder.textInputNome.setText(classeDeDadosFireBaseMVVM.nome)
        holder.textInputIdade.setText(classeDeDadosFireBaseMVVM.idade)

        holder.imageView.setOnClickListener {

            //todo salva a imagem
            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmSalvarImagemAdapter(classeDeDadosFireBaseMVVM)

            //todo atualiza a foto adapter
            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmListarImagensNotyfy()
        }

        holder.btnAtualizar.setOnClickListener {

            val bundleId = Bundle().apply {
                putString("id", "${classeDeDadosFireBaseMVVM.id}")
            }

            val bundleNome = Bundle().apply {
                putString("nome", "${classeDeDadosFireBaseMVVM.nome}")
            }

            val bundleIdade = Bundle().apply {
                putString("idade", "${classeDeDadosFireBaseMVVM.idade}")
            }

            val bundle = Bundle().apply {
                putBundle("bundleId", bundleId)
                putBundle("bundleNome", bundleNome)
                putBundle("bundleIdade", bundleIdade)
            }

            //todo instancia o viewmodel
            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmAdicionar(bundle, position)
        }
        holder.btnDeletar.setOnClickListener {

            //todo instancia o viewmodel
            val viewModelFireBaseMVVM = ViewModelFireBaseMVVM()

            //todo deleta o item
            viewModelFireBaseMVVM.funcaoDeletarPeloViewModel(classeDeDadosFireBaseMVVM)

            //todo notifica o adapter
            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmDeleteNotyfy(position)
        }
    }

    fun retornaDados(dadosRetornados: List<ModelFireBaseMVVM>) {

        listaRetornada = dadosRetornados

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listaRetornada.size
    }
}

class funcaoDiffUtil : DiffUtil.ItemCallback<ModelFireBaseMVVM>() {

    override fun areItemsTheSame(
        itemAntigo: ModelFireBaseMVVM,
        itemNovo: ModelFireBaseMVVM
    ): Boolean {

        return itemAntigo.id == itemNovo.id
    }

    override fun areContentsTheSame(
        oldItem: ModelFireBaseMVVM,
        newItem: ModelFireBaseMVVM
    ): Boolean {

        return oldItem == newItem
    }
}

/*                if (classeDeDadosFireBaseMVVM.name == "Ana") {

                    interfaceSearchRecyclerView.ANA()

                    Toast.makeText(contexto, "Nome Ana Clicado", Toast.LENGTH_SHORT).show()
                }

                if (modelSearchRecyclerView.name  == "Carlos") {

                    interfaceSearchRecyclerView.CARLOS()

                    Toast.makeText(contexto, "Nome Carlos Clicado", Toast.LENGTH_SHORT).show()
                }

                if (modelSearchRecyclerView.name == "Maria") {

                    interfaceSearchRecyclerView.MARIA()

                    Toast.makeText(contexto, "Nome Maria Clicado", Toast.LENGTH_SHORT).show()
                }
             } */






