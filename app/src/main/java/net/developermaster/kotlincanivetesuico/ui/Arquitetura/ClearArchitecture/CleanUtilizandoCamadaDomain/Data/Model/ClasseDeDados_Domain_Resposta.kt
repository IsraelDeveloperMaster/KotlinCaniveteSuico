package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Model

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.ModelDomain.ClasseDeDadosPostagem_Model_Domain


data class ClasseDeDados_Domain_Resposta(

    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)

fun ClasseDeDados_Domain_Resposta.paraPostagemDomainMap() : ClasseDeDadosPostagem_Model_Domain {

    return ClasseDeDadosPostagem_Model_Domain(

        //descrisao = RetornoDasPostagensPorMap.corpodamensagem, //todo exemplo nao é mas body agora é corpodamensagem

        descrisao = this.body,
        titulo = this.title,
        codigo = this.id,
        usuarioId = this.userId
    )
}
