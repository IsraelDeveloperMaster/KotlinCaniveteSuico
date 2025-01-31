package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto

data class Address(
    val address: String,
    val city: String,
    val coordinates: Coordinates,
    val postalCode: String,
    val state: String
)