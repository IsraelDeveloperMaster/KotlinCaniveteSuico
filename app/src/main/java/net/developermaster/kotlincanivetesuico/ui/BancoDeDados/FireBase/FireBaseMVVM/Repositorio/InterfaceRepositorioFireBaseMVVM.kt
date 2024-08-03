package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.Repositorio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM

class InterfaceRepositorioFireBaseMVVM {

    //todo lista de dados
    private val listaDadosFirebase = MutableLiveData<List<ClasseDeDadosFireBaseMVVM>>()

    //todo foto perfil
    private var fotoAdapterUrl = ""


    fun funcaoAtualizaImagemDocumentAdapterPeloRepositorio (idImagem: String ) {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("imagens").child("$idImagem.jpg") .downloadUrl

            .addOnSuccessListener { urlRetornada ->

                fotoAdapterUrl = urlRetornada.toString()

                println( "interfaceRepositorioFireBaseMVVM atualizar foto document -> $fotoAdapterUrl")

                val mapClasseDeDados = mapOf( "foto" to fotoAdapterUrl )

                FirebaseFirestore.getInstance().collection("FireBaseMVVM") .document( idImagem ).update(mapClasseDeDados)

                    .addOnSuccessListener { println(" interfaceRepositorioFireBaseMVVM atualizado foto document com sucesso id:$urlRetornada ") }

                    .addOnFailureListener { println(" interfaceRepositorioFireBaseMVVM erro ao atualizar foto document ") }
            }

            .addOnFailureListener { falha ->

                println(" interfaceRepositorioFireBaseMVVM falha ao atualizar foto document -> $falha ")
            }

        /*return fotoPerfil*/
    }

    fun funcaoAtualizaPeloRepositorio(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM) {

        val mapClasseDeDados = mapOf( "nome" to classeDeDadosFireBaseMVVM.nome, "idade" to classeDeDadosFireBaseMVVM.idade )

        FirebaseFirestore.getInstance().collection("FireBaseMVVM") .document(classeDeDadosFireBaseMVVM.id).update(mapClasseDeDados)
            .addOnSuccessListener { println(" interfaceRepositorioFireBaseMVVM atualizar sucesso ") }
            .addOnFailureListener { println(" interfaceRepositorioFireBaseMVVM atualizar erro ") }
    }

    fun funcaoSalvaPeloRepositorio(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM) {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").document() .set(classeDeDadosFireBaseMVVM)
            .addOnSuccessListener { println(" interfaceRepositorioFireBaseMVVM salvar sucesso ") }
            .addOnFailureListener { println(" interfaceRepositorioFireBaseMVVM salvar sucesso ") }
    }

    fun funcaoListarTodosPeloRepositorio () : LiveData<List<ClasseDeDadosFireBaseMVVM>> {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").get()
            .addOnSuccessListener { sucesso ->

                //todo lista de dados
                val listaDeDados = mutableListOf<ClasseDeDadosFireBaseMVVM>()

                //todo limpa a lista
                listaDeDados.clear()

                for ( document in sucesso) {

                    val listaRetornada = document.toObject(ClasseDeDadosFireBaseMVVM::class.java) .apply { id = document.id }

                    listaDeDados.add(listaRetornada)

                    println(" interfaceRepositorioFireBaseMVVM listar todos sucesso $listaDeDados ")
                }

                listaDadosFirebase.value = listaDeDados

            }
            .addOnFailureListener { println(" interfaceRepositorioFireBaseMVVM listar todos erro ")
        }

        return listaDadosFirebase
    }

    fun funcaoDeletarPeloRepositorio(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM) {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM")
            .document(classeDeDadosFireBaseMVVM.id).delete()
            .addOnSuccessListener { println(" interfaceRepositorioFireBaseMVVM deletar sucesso ") }
            .addOnFailureListener { println(" interfaceRepositorioFireBaseMVVM deletar erro ") }





        FirebaseStorage.getInstance() .getReference("imagens").child( classeDeDadosFireBaseMVVM.id + ".jpg"  ).delete()
            .addOnSuccessListener { println(" interfaceRepositorioFireBaseMVVM deletar child sucesso ") }
            .addOnFailureListener { println(" interfaceRepositorioFireBaseMVVM deletar child erro ") }
    }

    fun funcaoListarNomePeloRepositorio ( nome: String ) : LiveData<List<ClasseDeDadosFireBaseMVVM>> {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").whereEqualTo("nome", nome).get()
            .addOnSuccessListener { sucesso ->

                //todo lista de dados
                val listaDeDados = mutableListOf<ClasseDeDadosFireBaseMVVM>()

                //todo limpa a lista
                listaDeDados.clear()

                for (document in sucesso) {

                    val listaRetornada = document.toObject(ClasseDeDadosFireBaseMVVM::class.java) .apply { id = document.id }

                    listaDeDados.add(listaRetornada)

                    println(" interfaceRepositorioFireBaseMVVM listar nome sucesso $listaDeDados ")
                }

                listaDadosFirebase.value = listaDeDados

            }.addOnFailureListener {

                println(" interfaceRepositorioFireBaseMVVM listar nome erro ")
            }
        return listaDadosFirebase
    }

    fun funcaoListarIdadePeloRepositorio ( idade: String ) : LiveData<List<ClasseDeDadosFireBaseMVVM>> {

        FirebaseFirestore.getInstance().collection("FireBaseMVVM").whereEqualTo("idade", idade).get()
            .addOnSuccessListener { sucesso ->

                //todo lista de dados
                val listaDeDados = mutableListOf<ClasseDeDadosFireBaseMVVM>()

                //todo limpa a lista
                listaDeDados.clear()

                for (document in sucesso) {

                    val listaRetornada = document.toObject(ClasseDeDadosFireBaseMVVM::class.java) .apply { id = document.id }

                    listaDeDados.add(listaRetornada)

                    println(" interfaceRepositorioFireBaseMVVM nome sucesso $listaDeDados ")
                }

                listaDadosFirebase.value = listaDeDados

            }.addOnFailureListener {

                println(" interfaceRepositorioFireBaseMVVM listar nome erro ")
            }
        return listaDadosFirebase
    }

    fun funcaoListarFotoPerfilPeloRepositorio () : String {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("image") .child("image.jpg") .downloadUrl

            .addOnSuccessListener { fotoPerfilRetornada ->

                fotoAdapterUrl = fotoPerfilRetornada.toString()

            }
            .addOnFailureListener { falha ->

                println(" interfaceRepositorioFireBaseMVVM listar fotos erro -> $falha ")
            }

        return fotoAdapterUrl
    }

    fun funcaoAutenticarPeloRepositorio ( email: String, senha: String ) : Boolean {

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha)
                .addOnSuccessListener { sucesso ->

                    val email = sucesso.user?.email
                    val id = sucesso.user?.uid
                    val provedor = sucesso.user?.providerId

                    println( "sucesso:\n \n  id: $id \n \n Provedor: $provedor \n \n Email: $email" )

                }.addOnFailureListener { falha ->

                    println(" interfaceRepositorioFireBaseMVVM autenticar usuario -> $falha.message")

                }
        return true
    }
}





