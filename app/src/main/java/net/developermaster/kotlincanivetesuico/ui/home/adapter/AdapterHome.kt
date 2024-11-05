import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.core.content.ContextCompat.getString
import androidx.recyclerview.widget.RecyclerView
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.home.adapter.InterfaceHome
import net.developermaster.kotlincanivetesuico.ui.home.model.ModelHome
import java.util.Locale

class AdapterHome(val modelHome: List<ModelHome>, val interfaceHome: InterfaceHome) :
    RecyclerView.Adapter<AdapterHome.HomeViewHolder>(), Filterable {

    private var filtro: List<ModelHome> = modelHome

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_titulos_botoes, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(filtro[position], interfaceHome)
    }

    override fun getItemCount(): Int {
        return filtro.size
    }

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val botao: Button = itemView.findViewById(R.id.botao)
//        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

        fun bind(modelHome: ModelHome, interfaceHome: InterfaceHome) {

            //Pegando o Context
            val contexto = botao.context

            botao.text = modelHome.name

//            val imagem = imageView.setImageResource(ModelHome.logo)

            botao.setOnClickListener {

                ////////////////////////// COMPOSE //////////////////////////////////////
                if (modelHome.name == "COMPOSE") {
                    interfaceHome.COMPOSE()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_COMPOSE), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// COMPOSE //////////////////////////////////////

                ////////////////////////// FIREBASE //////////////////////////////////////
                if (modelHome.name == "FIREBASE") {
                    interfaceHome.FIREBASE()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_FIREBASE), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// FIREBASE //////////////////////////////////////

                ////////////////////////// ROOM //////////////////////////////////////
                if (modelHome.name == "ROOM") {
                    interfaceHome.ROOM()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_ROOM), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// ROOM //////////////////////////////////////

                ////////////////////////// SEARCHVIEW //////////////////////////////////////
                if (modelHome.name == "SEARCH VIEW") {
                    interfaceHome.SEARCHVIEW()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_SEARCHVIEW), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// SEARCHVIEW //////////////////////////////////////

                ////////////////////////// FRAGMENT //////////////////////////////////////
                if (modelHome.name == "FRAGMENT") {
                    interfaceHome.ROOM()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_FRAGMENT), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// FRAGMENT //////////////////////////////////////

                ////////////////////////// ARQUITETURA //////////////////////////////////////
                if (modelHome.name == "ARQUITETURA") {
                    interfaceHome.ARQUITETURA()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.MAIN_ARQUITETURA), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// ARQUITETURA //////////////////////////////////////

                ////////////////////////// MVC //////////////////////////////////////
                if (modelHome.name == "MVC") {
                    interfaceHome.MVC()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_MVC), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// MVC //////////////////////////////////////

                ////////////////////////// MVP //////////////////////////////////////
                if (modelHome.name == "MVP") {
                    interfaceHome.MVP()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_MVC), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// MVP //////////////////////////////////////

                ////////////////////////// VIEWMODEL //////////////////////////////////////
                if (modelHome.name == "VIEWMODEL") {
                    interfaceHome.VIEWMODEL()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_VIEWMODEL), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// VIEWMODEL //////////////////////////////////////

                ////////////////////////// LIVEDATA //////////////////////////////////////
                if (modelHome.name == "LIVEDATA") {
                    interfaceHome.LIVEDATA()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_LIVEDATA), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// LIVEDATA //////////////////////////////////////

                ////////////////////////// DATABINDING //////////////////////////////////////
                if (modelHome.name == "DATABINDING") {
                    interfaceHome.DATABINDING()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_DATABINDING), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// DATABINDING //////////////////////////////////////

                ////////////////////////// MVVM //////////////////////////////////////
                if (modelHome.name == "MVVM") {
                    interfaceHome.MVVM()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_MVVM), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// MVVM //////////////////////////////////////

                ////////////////////////// CLEAN ARCHITECTURE //////////////////////////////////////
                if (modelHome.name == getString(contexto, R.string.EXT_CLEAN_ARCHITECTURE)) {
                    interfaceHome.CLEAN()
                    Toast.makeText(
                        contexto,
                        getString(contexto, R.string.EXT_CLEAN_ARCHITECTURE),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// CLEAN ARCHITECTURE //////////////////////////////////////

                ////////////////////////// HILT //////////////////////////////////////
                if (modelHome.name == getString(contexto, R.string.EXT_HILT)) {
                    interfaceHome.HILT()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_HILT), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// HILT //////////////////////////////////////

                ////////////////////////// TEST //////////////////////////////////////
                if (modelHome.name == getString(contexto, R.string.EXT_TEST)) {
                    interfaceHome.TEST()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_TEST), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// TEST //////////////////////////////////////

                ////////////////////////// FLOW //////////////////////////////////////
                if (modelHome.name == getString(contexto, R.string.EXT_FLOW)) {
                    interfaceHome.FLOW()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_FLOW), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// FLOW //////////////////////////////////////

                ////////////////////////// GOOGLEMAP //////////////////////////////////////
                if (modelHome.name == getString(contexto, R.string.EXT_GOOGLE_MAP)) {
                    interfaceHome.GOOGLEMAP()
                    Toast.makeText(
                        contexto, getString(contexto, R.string.EXT_GOOGLE_MAP), Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// GOOGLEMAP //////////////////////////////////////

                ////////////////////////// SERVICES BACKGROUND //////////////////////////////////////
                if (modelHome.name == getString(contexto, R.string.EXT_SERVICES_BACKGROUND)) {
                    interfaceHome.SERVICESBACKGROUND()
                    Toast.makeText(
                        contexto,
                        getString(contexto, R.string.EXT_SERVICES_BACKGROUND),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                ////////////////////////// SERVICES BACKGROUND //////////////////////////////////////
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filteredList = mutableListOf<ModelHome>()
                if (constraint.isNullOrEmpty()) {
                    filteredList.addAll(modelHome)
                } else {
                    val filterPattern = constraint.toString().lowercase(Locale.ROOT).trim()
                    modelHome.forEach {
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

                filtro = results?.values as List<ModelHome>

                notifyDataSetChanged()
            }
        }
    }
}
