
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.ClasseDiffUtilRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM

class AdapterRoomMVVM(context: Context, private val interfaceRoomMVVM: InterfaceRoomMVVM) :
    RecyclerView.Adapter<AdapterRoomMVVM.ViewHolder>() {

        //todo atualiza a lista DiffUtil
        fun atualizaTodaListaDiffUtil( novaLista: List<ModelEntidadeRoomMVVM>) {

            val diffResult = DiffUtil.calculateDiff(ClasseDiffUtilRoomMVVM( listaRetornada, novaLista))

            listaRetornada = novaLista

            diffResult.dispatchUpdatesTo(this)
        }

    val context = context

    //todo lista de dados
    private var listaRetornada: List<ModelEntidadeRoomMVVM> = emptyList()

    inner class ViewHolder(itensDaView: View) : RecyclerView.ViewHolder(itensDaView) {

        val textInputNome: TextInputEditText =
            itensDaView.findViewById(R.id.textInput_nome_roomMVVM)
        val textInputIdade: TextInputEditText =
            itensDaView.findViewById(R.id.textInput_idade_roomMVVM)
        val btnAtualizar: Button = itensDaView.findViewById(R.id.btnAtualizar)
        val btnDeletar: Button = itensDaView.findViewById(R.id.btnDeletar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_room_mvvm_recyclerview, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val classeDeDadosEntidadeRoomMVVM = listaRetornada[position]

        holder.textInputNome.setText(classeDeDadosEntidadeRoomMVVM.nome)
        holder.textInputIdade.setText(classeDeDadosEntidadeRoomMVVM.idade)

        holder.btnAtualizar.setOnClickListener {

            val bundleId = Bundle().apply {
                putString("id", "${classeDeDadosEntidadeRoomMVVM.id}")
            }

            val bundleNome = Bundle().apply {
                putString("nome", "${classeDeDadosEntidadeRoomMVVM.nome}")
            }

            val bundleIdade = Bundle().apply {
                putString("idade", "${classeDeDadosEntidadeRoomMVVM.idade}")
            }

            val bundle = Bundle().apply {
                putBundle("bundleId", bundleId)
                putBundle("bundleNome", bundleNome)
                putBundle("bundleIdade", bundleIdade)
            }

            //todo instancia o viewmodel
            interfaceRoomMVVM.funcaoInterfaceRoomMvvmAdicionar(bundle, position)
        }
        holder.btnDeletar.setOnClickListener {

            //todo instancia o viewmodel
            val viewModelRoomMVVM: ViewModelRoomMVVM?

            viewModelRoomMVVM = ViewModelProvider(context as ViewModelStoreOwner)[ViewModelRoomMVVM::class.java]

            //todo instancia o viewmodel
            viewModelRoomMVVM.funcaoDeletarPeloViewModel(classeDeDadosEntidadeRoomMVVM)

            //todo notifica o adapter
            interfaceRoomMVVM.funcaoInterfaceRoomMvvmDeleteNotyfy(position)
        }
    }

    fun retornaDados( dadosRetornados: List<ModelEntidadeRoomMVVM> ) {

        //todo lista de dados retorna para o fragment
        listaRetornada = dadosRetornados
    }

    override fun getItemCount(): Int {
        return listaRetornada.size
    }
}
