package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Model_Data

data class ResultadoDadosDomainUsuarios(
    val limit: Int,
    val skip: Int,
    val total: Int,
    val users: List<ClasseDeDadosDataDomainApiDummy_Usuarios>
)