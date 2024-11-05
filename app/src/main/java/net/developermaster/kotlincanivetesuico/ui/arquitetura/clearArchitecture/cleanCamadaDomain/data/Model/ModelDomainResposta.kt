package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.Model

import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain


data class ClasseDeDados_Domain_Resposta(

    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)

fun ClasseDeDados_Domain_Resposta.paraPostagemDomainMap() : ModelPostagemModelDomain {

    return ModelPostagemModelDomain(

        //descrisao = RetornoDasPostagensPorMap.corpodamensagem, //todo exemplo nao é mas body agora é corpodamensagem

        descrisao = this.body,
        titulo = this.title,
        codigo = this.id,
        usuarioId = this.userId
    )
}
