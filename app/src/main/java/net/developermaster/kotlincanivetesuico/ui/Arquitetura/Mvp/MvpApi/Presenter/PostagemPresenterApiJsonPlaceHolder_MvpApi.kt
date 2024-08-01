package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Presenter

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Model.PostagemApiJsonPlaceHolder_MvpApi

class PostagemPresenterApiJsonPlaceHolder_MvpApi(private val interfacePresenterPostagemapijsonplaceholderMvpapi: InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi, private val postagemapijsonplaceholderMvpapi: PostagemApiJsonPlaceHolder_MvpApi) : AppCompatActivity() {

    fun recuperaPostagensApiJsonPlaceHolder() {

        interfacePresenterPostagemapijsonplaceholderMvpapi.progressBar(true)

        CoroutineScope(Dispatchers.IO).launch {

            withContext(Dispatchers.Main) {

                //todo cuida automaticamente do ciclo de vida da activity
                lifecycleScope.launch {

                    val postagemApiRecuperadasPeloPresenter = postagemapijsonplaceholderMvpapi.funcaoRecuperaPostagens()

                    interfacePresenterPostagemapijsonplaceholderMvpapi.exibirUsuariosApartirDaInterfacePresenter(postagemApiRecuperadasPeloPresenter)

//                    Log.i(" msg_API ", " $postagemApiRecuperadasPeloPresenter ")

                    interfacePresenterPostagemapijsonplaceholderMvpapi.progressBar(false)
                }
            }
        }
    }
}