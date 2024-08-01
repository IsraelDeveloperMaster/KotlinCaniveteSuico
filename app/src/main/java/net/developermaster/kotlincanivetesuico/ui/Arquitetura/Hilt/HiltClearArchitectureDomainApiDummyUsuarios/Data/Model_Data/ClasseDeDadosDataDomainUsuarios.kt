package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Model_Data

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.Model.EstruturaDeRetornoDomainUsuarios

data class ClasseDeDadosDataDomainApiDummy_Usuarios(
    val address: Address,
    val age: Int,
    val bank: Bank,
    val birthDate: String,
    val bloodGroup: String,
    val company: Company,
    val crypto: Crypto,
    val ein: String,
    val email: String,
    val eyeColor: String,
    val firstName: String,
    val gender: String,
    val hair: Hair,
    val height: Double,
    val id: Int,
    val image: String,
    val ip: String,
    val lastName: String,
    val macAddress: String,
    val maidenName: String,
    val password: String,
    val phone: String,
    val role: String,
    val ssn: String,
    val university: String,
    val userAgent: String,
    val username: String,
    val weight: Double
)

fun ClasseDeDadosDataDomainApiDummy_Usuarios.toUsuario() : EstruturaDeRetornoDomainUsuarios {

    return EstruturaDeRetornoDomainUsuarios(

        nome = this.firstName,
        sobrenome = this.lastName,
        idade = this.age,
        email = this.email,
        telefone = this.phone,
        imagem = this.image,
    )
}

