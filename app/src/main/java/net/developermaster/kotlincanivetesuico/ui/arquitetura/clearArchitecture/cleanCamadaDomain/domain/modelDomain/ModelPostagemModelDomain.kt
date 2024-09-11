package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain

data class ModelPostagemModelDomain (

    val descrisao: String,

    val codigo: Int,

    val titulo: String,

    val usuarioId: Int

) {

    fun validarClasseDeDados_Model_Domain() {

    }
}