
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.adapter.InterfaceSearchRecyclerView
import net.developermaster.kotlincanivetesuico.ui.searchView.searchViewRecyclerView.model.ModelSearchRecyclerView
import java.util.Locale

class AdapterSearchRecyclerView (val modelSearchRecyclerView : List<ModelSearchRecyclerView>, val interfaceSearchRecyclerView: InterfaceSearchRecyclerView) : RecyclerView.Adapter<AdapterSearchRecyclerView.ViewHolder>()  , Filterable {

    private var filtro: List<ModelSearchRecyclerView> = modelSearchRecyclerView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_titulos_botoes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(filtro [position] , interfaceSearchRecyclerView)
    }

    override fun getItemCount(): Int {
        return filtro.size
    }

   class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val botao: Button = itemView.findViewById(R.id.botao)
//        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

        fun bind(modelSearchRecyclerView: ModelSearchRecyclerView, interfaceSearchRecyclerView: InterfaceSearchRecyclerView) {

            //Pegando o Context
            val contexto = botao.context

            botao.text = modelSearchRecyclerView.name

//            val imagem = imageView.setImageResource(modelSearchRecyclerView.logo)

            botao.setOnClickListener {

                if (modelSearchRecyclerView.name == "Ana") {

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
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filteredList = mutableListOf<ModelSearchRecyclerView>()
                if (constraint.isNullOrEmpty()) {
                    filteredList.addAll(modelSearchRecyclerView)
                } else {
                    val filterPattern = constraint.toString().lowercase(Locale.ROOT).trim()
                    modelSearchRecyclerView.forEach {
                        if (it.name.lowercase(Locale.ROOT).contains(filterPattern)) {
                            filteredList.add(it)
                        }
                    }
                }
                val results = FilterResults()
                results.values = filteredList
                return results
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {

                filtro = results?.values as List<ModelSearchRecyclerView>

                notifyDataSetChanged()
            }
        }
    }
}
