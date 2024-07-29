
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.SearchView.SearchViewRecyclerView.Interface.InterfaceSearchRecyclerView
import net.developermaster.kotlincanivetesuico.ui.SearchView.SearchViewRecyclerView.Model.ClasseDeDadosSearchRecyclerView
import java.util.Locale

class AdapterSearchRecyclerView (val classeDeDadosSearchRecyclerView : List<ClasseDeDadosSearchRecyclerView>, val interfaceSearchRecyclerView: InterfaceSearchRecyclerView ) : RecyclerView.Adapter<AdapterSearchRecyclerView.ViewHolder>()  , Filterable {

    private var filtro: List<ClasseDeDadosSearchRecyclerView> = classeDeDadosSearchRecyclerView

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

        fun bind(classeDeDadosSearchRecyclerView: ClasseDeDadosSearchRecyclerView, interfaceSearchRecyclerView: InterfaceSearchRecyclerView ) {

            //Pegando o Context
            val contexto = botao.context

            botao.text = classeDeDadosSearchRecyclerView.name

//            val imagem = imageView.setImageResource(classeDeDadosSearchRecyclerView.logo)

            botao.setOnClickListener {

                if (classeDeDadosSearchRecyclerView.name == "Ana") {

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
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filteredList = mutableListOf<ClasseDeDadosSearchRecyclerView>()
                if (constraint.isNullOrEmpty()) {
                    filteredList.addAll(classeDeDadosSearchRecyclerView)
                } else {
                    val filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim()
                    classeDeDadosSearchRecyclerView.forEach {
                        if (it.name.toLowerCase(Locale.ROOT).contains(filterPattern)) {
                            filteredList.add(it)
                        }
                    }
                }
                val results = FilterResults()
                results.values = filteredList
                return results
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {

                filtro = results?.values as List<ClasseDeDadosSearchRecyclerView>

                notifyDataSetChanged()
            }
        }
    }
}
