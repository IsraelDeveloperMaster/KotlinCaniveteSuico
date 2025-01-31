package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.Model

data class ResultadoDummyUsuarios(
    val limit: Int,
    val skip: Int,
    val total: Int,
    val users: List<ModelDummyApiUsuarios>
)