package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvc.model


//todo classe de informcoes dos ususarios
class UsuarioApiMVC {

    fun recuperar_usuarios() : List < UsuarioMVC > {

        val lista_de_usuarios = listOf(

            UsuarioMVC( " Ana" ,20 ) ,
            UsuarioMVC( "Carlos" ,30 ) ,
            UsuarioMVC( "Lucas" ,40 ) ,
            UsuarioMVC( "Maria" ,50 ) ,

        )

        return lista_de_usuarios

    }
}
