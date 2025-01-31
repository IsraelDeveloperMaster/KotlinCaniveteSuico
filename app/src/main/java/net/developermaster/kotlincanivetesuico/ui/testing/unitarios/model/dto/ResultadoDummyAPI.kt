package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto

data class ResultadoDummyAPI(
    val limit: Int,
    val skip: Int,
    val total: Int,
    val users: List<Usuario>
)