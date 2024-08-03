
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
import net.developermaster.kotlincanivetesuico.ui.Home.Interface.InterfaceHome
import net.developermaster.kotlincanivetesuico.ui.Home.Model.ClasseDeDadosHome
import java.util.Locale

class AdapterHome(val classeDeDadosHome: List<ClasseDeDadosHome>, val interfaceHome: InterfaceHome ) : RecyclerView.Adapter<AdapterHome.ViewHolder>()  , Filterable {

    private var filtro: List<ClasseDeDadosHome> = classeDeDadosHome

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_titulos_botoes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(filtro[position] , interfaceHome)
    }

    override fun getItemCount(): Int {
        return filtro.size
    }

   class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       private val botao: Button = itemView.findViewById(R.id.botao)
//        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

       fun bind(classeDeDadosHome: ClasseDeDadosHome, interfaceHome: InterfaceHome) {

           //Pegando o Context
           val contexto = botao.context

           botao.text = classeDeDadosHome.name

//            val imagem = imageView.setImageResource(classeDeDadosHome.logo)

           botao.setOnClickListener {

                   ////////////////////////// COMPOSE //////////////////////////////////////
                   if (classeDeDadosHome.name == "COMPOSE")  {
                        interfaceHome.COMPOSE()
                        Toast.makeText(contexto, getString(contexto, R.string.EXT_COMPOSE), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// COMPOSE //////////////////////////////////////

                   ////////////////////////// FIREBASE //////////////////////////////////////
                   if (classeDeDadosHome.name == "FIREBASE")  {
                        interfaceHome.FIREBASE()
                        Toast.makeText(contexto, getString(contexto, R.string.EXT_FIREBASE), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// FIREBASE //////////////////////////////////////

                   ////////////////////////// ROOM //////////////////////////////////////
                   if (classeDeDadosHome.name == "ROOM") {
                       interfaceHome.ROOM()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_ROOM), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// ROOM //////////////////////////////////////

                   ////////////////////////// SEARCHVIEW //////////////////////////////////////
                    if (classeDeDadosHome.name == "SEARCH VIEW") {
                   interfaceHome.SEARCHVIEW()
                        Toast.makeText(contexto, getString(contexto, R.string.EXT_SEARCHVIEW), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// SEARCHVIEW //////////////////////////////////////

                   ////////////////////////// FRAGMENT //////////////////////////////////////
                   if (classeDeDadosHome.name == "FRAGMENT") {
                       interfaceHome.ROOM()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_FRAGMENT), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// FRAGMENT //////////////////////////////////////

                   ////////////////////////// ARQUITETURA //////////////////////////////////////
                   if (classeDeDadosHome.name == "ARQUITETURA") {
                       interfaceHome.ARQUITETURA()
                       Toast.makeText(contexto, getString(contexto, R.string.MAIN_ARQUITETURA), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// ARQUITETURA //////////////////////////////////////

                   ////////////////////////// MVC //////////////////////////////////////
                   if (classeDeDadosHome.name == "MVC") {
                       interfaceHome.MVC()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_MVC), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// MVC //////////////////////////////////////

                   ////////////////////////// MVP //////////////////////////////////////
                   if (classeDeDadosHome.name == "MVP") {
                       interfaceHome.MVP()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_MVC), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// MVP //////////////////////////////////////

                   ////////////////////////// VIEWMODEL //////////////////////////////////////
                   if (classeDeDadosHome.name == "VIEWMODEL") {
                       interfaceHome.VIEWMODEL()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_VIEWMODEL), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// VIEWMODEL //////////////////////////////////////

                   ////////////////////////// LIVEDATA //////////////////////////////////////
                   if (classeDeDadosHome.name == "LIVEDATA") {
                       interfaceHome.LIVEDATA()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_LIVEDATA), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// LIVEDATA //////////////////////////////////////

                   ////////////////////////// DATABINDING //////////////////////////////////////
                   if (classeDeDadosHome.name == "DATABINDING") {
                       interfaceHome.DATABINDING()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_DATABINDING), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// DATABINDING //////////////////////////////////////

                   ////////////////////////// MVVM //////////////////////////////////////
                   if (classeDeDadosHome.name == "MVVM") {
                       interfaceHome.MVVM()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_MVVM), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// MVVM //////////////////////////////////////

                   ////////////////////////// CLEAN ARCHITECTURE //////////////////////////////////////
                   if (classeDeDadosHome.name == getString(contexto, R.string.EXT_CLEAN_ARCHITECTURE)) {
                       interfaceHome.CLEAN()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_CLEAN_ARCHITECTURE), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// CLEAN ARCHITECTURE //////////////////////////////////////

                   ////////////////////////// HILT //////////////////////////////////////
                   if (classeDeDadosHome.name == getString(contexto, R.string.EXT_HILT)) {
                       interfaceHome.HILT()
                       Toast.makeText(contexto, getString(contexto, R.string.EXT_HILT), Toast.LENGTH_SHORT).show() }
                   ////////////////////////// HILT //////////////////////////////////////
           }
       }
   }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filteredList = mutableListOf<ClasseDeDadosHome>()
                if (constraint.isNullOrEmpty()) {
                    filteredList.addAll(classeDeDadosHome)
                } else {
                    val filterPattern = constraint.toString().lowercase(Locale.ROOT).trim()
                    classeDeDadosHome.forEach {
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
                filtro = results?.values as List<ClasseDeDadosHome>
                notifyDataSetChanged()
            }
        }
    }
}
