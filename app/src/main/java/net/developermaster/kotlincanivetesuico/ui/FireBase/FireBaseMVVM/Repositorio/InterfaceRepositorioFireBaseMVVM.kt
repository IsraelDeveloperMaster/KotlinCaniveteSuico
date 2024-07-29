package net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Repositorio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM

class InterfaceRepositorioFireBaseMVVM {

    //todo lista de dados
    private val listaDadosFirebase = MutableLiveData<List<ClasseDeDadosFireBaseMVVM>>()
    private var fotoPerfil = " "



    fun funcaoAtualizaPeloRepositorio(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM) {

        val mapClasseDeDados = mapOf( "nome" to classeDeDadosFireBaseMVVM.nome, "idade" to classeDeDadosFireBaseMVVM.idade )

        FirebaseFirestore.getInstance().collection("FireBaseMVVM") .document(classeDeDadosFireBaseMVVM.id).update(mapClasseDeDados)
            .addOnSuccessListener { println(" repositorio firebase mvvm atualizar sucesso ") }
            .addOnFailureListener { println(" repositorio firebase mvvm atualizar erro ") }
    }

    fun funcaoSalvaPeloRepositorio(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM) {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").document() .set(classeDeDadosFireBaseMVVM)
            .addOnSuccessListener { println(" repositorio firebase mvvm salvar sucesso ") }
            .addOnFailureListener { println(" repositorio firebase mvvm salvar sucesso ") }
    }

    fun funcaoListarTodosPeloRepositorio () : LiveData<List<ClasseDeDadosFireBaseMVVM>> {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").get()
            .addOnSuccessListener { Sucesso ->

                //todo lista de dados
                val listaDeDados = mutableListOf<ClasseDeDadosFireBaseMVVM>()

                //todo limpa a lista
                listaDeDados.clear()

                for (document in Sucesso) {

                    val listaRetornada = document.toObject(ClasseDeDadosFireBaseMVVM::class.java) .apply { id = document.id }

                    listaDeDados.add(listaRetornada)

                    println(" repositorio firebase mvvm listar todos sucesso $listaDeDados ")
                }

                listaDadosFirebase.value = listaDeDados

            }.addOnFailureListener { println(" repositorio firebase mvvm listar todos erro ")
            }
        return listaDadosFirebase
    }

    fun funcaoDeletarPeloRepositorio(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM) {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM")
            .document(classeDeDadosFireBaseMVVM.id).delete()
            .addOnSuccessListener { println(" repositorio firebase mvvm deletar sucesso ") }
            .addOnFailureListener { println(" repositorio firebase mvvm deletar erro ") }
    }

    fun funcaoListarNomePeloRepositorio ( nome: String ) : LiveData<List<ClasseDeDadosFireBaseMVVM>> {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").whereEqualTo("nome", nome).get()
            .addOnSuccessListener { Sucesso ->

                //todo lista de dados
                val listaDeDados = mutableListOf<ClasseDeDadosFireBaseMVVM>()

                //todo limpa a lista
                listaDeDados.clear()

                for (document in Sucesso) {

                    val listaRetornada = document.toObject(ClasseDeDadosFireBaseMVVM::class.java) .apply { id = document.id }

                    listaDeDados.add(listaRetornada)

                    println(" repositorio firebase mvvm listar nome sucesso $listaDeDados ")
                }

                listaDadosFirebase.value = listaDeDados

            }.addOnFailureListener {

                println(" repositorio firebase mvvm listar nome erro ")
            }
        return listaDadosFirebase
    }

    fun funcaoListarIdadePeloRepositorio ( idade: String ) : LiveData<List<ClasseDeDadosFireBaseMVVM>> {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").whereEqualTo("idade", idade).get()
            .addOnSuccessListener { Sucesso ->

                //todo lista de dados
                val listaDeDados = mutableListOf<ClasseDeDadosFireBaseMVVM>()

                //todo limpa a lista
                listaDeDados.clear()

                for (document in Sucesso) {

                    val listaRetornada = document.toObject(ClasseDeDadosFireBaseMVVM::class.java) .apply { id = document.id }

                    listaDeDados.add(listaRetornada)

                    println(" repositorio firebase mvvm listar nome sucesso $listaDeDados ")
                }

                listaDadosFirebase.value = listaDeDados

            }.addOnFailureListener {

                println(" repositorio firebase mvvm listar nome erro ")
            }
        return listaDadosFirebase
    }

    fun funcaoListarFotoPerfilPeloRepositorio () : String {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("image") .child("image.jpg") .downloadUrl

            .addOnSuccessListener { fotoPerfilRetornada ->

                fotoPerfil = fotoPerfilRetornada.toString()

                println( "interfaceRepositorioFireBaseMVVM listar fotos -> $fotoPerfil")

            }
            .addOnFailureListener {

                println(" repositorio firebase mvvm listar nome erro ")
            }

        return fotoPerfil
    }
}





