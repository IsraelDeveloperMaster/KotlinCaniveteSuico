
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
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Adapter.InterfaceFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Repositorio.InterfaceRepositorioFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.ViewModel.ViewModelFireBaseMVVM

class AdapterFireBaseMVVM(private val interfaceFireBaseMVVM: InterfaceFireBaseMVVM) :
    RecyclerView.Adapter<AdapterFireBaseMVVM.ViewHolder>() {

    private var listaRetornada: List<ClasseDeDadosFireBaseMVVM> = emptyList()

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

            val interfaceRepositorioFireBaseMVVM = InterfaceRepositorioFireBaseMVVM()

            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmSalvarImagem(classeDeDadosFireBaseMVVM)

            interfaceRepositorioFireBaseMVVM.funcaoAtualizaFotoAdapterPeloRepositorio(classeDeDadosFireBaseMVVM)

            //todo notifica o adapter
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

            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmAdicionar(bundle, position)
        }
        holder.btnDeletar.setOnClickListener {

            val viewModelFireBaseMVVM = ViewModelFireBaseMVVM()

            viewModelFireBaseMVVM.funcaoDeletarPeloViewModel(classeDeDadosFireBaseMVVM)

            //todo notifica o adapter
            interfaceFireBaseMVVM.funcaoInterfaceFireBaseMvvmDeleteNotyfy(position)
        }
    }

    fun retornaDados(dadosRetornados: List<ClasseDeDadosFireBaseMVVM>) {

        listaRetornada = dadosRetornados

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listaRetornada.size
    }
}

class funcaoDiffUtil : DiffUtil.ItemCallback<ClasseDeDadosFireBaseMVVM>() {

    override fun areItemsTheSame(
        itemAntigo: ClasseDeDadosFireBaseMVVM,
        itemNovo: ClasseDeDadosFireBaseMVVM
    ): Boolean {

        return itemAntigo.id == itemNovo.id
    }

    override fun areContentsTheSame(
        oldItem: ClasseDeDadosFireBaseMVVM,
        newItem: ClasseDeDadosFireBaseMVVM
    ): Boolean {

        return oldItem == newItem
    }
}

/*                if (classeDeDadosFireBaseMVVM.name == "Ana") {

                    interfaceSearchRecyclerView.ANA()

                    Toast.makeText(contexto, "Nome Ana Clicado", Toast.LENGTH_SHORT).show()
                }

                if (classeDeDadosSearchRecyclerView.name  == "Carlos") {

                    interfaceSearchRecyclerView.CARLOS()

                    Toast.makeText(contexto, "Nome Carlos Clicado", Toast.LENGTH_SHORT).show()
                }

                if (classeDeDadosSearchRecyclerView.name == "Maria") {

                    interfaceSearchRecyclerView.MARIA()

                    Toast.makeText(contexto, "Nome Maria Clicado", Toast.LENGTH_SHORT).show()
                }
             } */






