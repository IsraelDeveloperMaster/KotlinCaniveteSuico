package net.developermaster.kotlincanivetesuico

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import dagger.hilt.android.AndroidEntryPoint
import net.developermaster.kotlincanivetesuico.databinding.ActivityMainBinding

@AndroidEntryPoint //todo todas as classe que iniciam junto com android devem receber esta anotacao
class MainActivity : AppCompatActivity()  {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("Fragmento_Modelo_Main", "OnCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

     /*   binding.appBarMain.fab.setOnClickListener { view ->

            //todo chama o fragment principal
            val navHostFragment = supportFragmentManager.findFragmentById (R.id.fragmentContainerView) as NavHostFragment
            val navController = navHostFragment.navController
            navController.navigate(R.id.fragment_RecyclerView_Simples)
        }*/

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController( R.id.fragmentContainerView)

        //todo chama os fragments que estao na aba navigation
        appBarConfiguration = AppBarConfiguration(setOf(

            R.id.fragment_Home,
            R.id.fragment_Arquitetura_Main,
            R.id.fragment_SearchView_Main,
            R.id.fragment_GoogleMap_Main,
            R.id.fragment_FireBase_Main ,
            R.id.fragment_Test_Main ,
            R.id.fragment_Flow_Main ,
            R.id.fragment_Room_Main ,
            R.id.fragment_ServicesBackGround_Main ),

            drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.main, menu)

        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentContainerView)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {

            R.id.id_home -> {

                //todo chama o fragment home
                val navHostFragment = supportFragmentManager.findFragmentById (R.id.fragmentContainerView) as NavHostFragment
                val navController = navHostFragment.navController
                navController.navigate(R.id.fragment_Home)

                Toast.makeText(this, "Home Clicado", Toast.LENGTH_SHORT).show()
                true
            }

            //todo item menu pesquisar
            R.id.id_pesquisar -> {

                //todo chama o fragment pesquisa
                val navHostFragment = supportFragmentManager.findFragmentById (R.id.fragmentContainerView) as NavHostFragment
                val navController = navHostFragment.navController
                navController.navigate(R.id.fragment_Home)

                Toast.makeText(this, " Pesquisar Clicado", Toast.LENGTH_SHORT).show()
                true
            }

            //todo item menu contato
            R.id.id_contato -> {

                //todo chama o fragment contato
                val navHostFragment = supportFragmentManager.findFragmentById (R.id.fragmentContainerView) as NavHostFragment
                val navController = navHostFragment.navController
                navController.navigate(R.id.fragment_contato)

                Toast.makeText(this, " Contato Clicado", Toast.LENGTH_SHORT).show()
                true
            }

            //todo item menu informacao
            R.id.id_informacao -> {
                Toast.makeText(this, " Informacao Clicado", Toast.LENGTH_SHORT).show()
                true
            }

            //todo item menu sair
            R.id.id_sair -> {

                //todo finaliza a sessao
                finish()

                Toast.makeText(this, " Sair Clicado", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}





