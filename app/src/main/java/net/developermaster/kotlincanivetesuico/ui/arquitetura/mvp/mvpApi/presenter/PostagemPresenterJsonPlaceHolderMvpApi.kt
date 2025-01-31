package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.presenter

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.model.PostagemJsonPlaceHolderMvpApi

class PostagemPresenterJsonPlaceHolderMvpApi(private val interfacePresenterPostagemapijsonplaceholderMvpapi: InterfacePresenterPostagemJsonPlaceHolderMvpApi, private val postagemapijsonplaceholderMvpapi: PostagemJsonPlaceHolderMvpApi) : AppCompatActivity() {

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