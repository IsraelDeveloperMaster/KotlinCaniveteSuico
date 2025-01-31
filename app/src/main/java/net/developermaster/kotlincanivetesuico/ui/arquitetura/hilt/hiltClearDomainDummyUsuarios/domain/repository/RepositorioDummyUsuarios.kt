package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.repository

import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.Model.ModelDummyApiUsuarios

interface RepositorioDummyUsuarios {
    suspend fun recuperarUsuarios() : List<ModelDummyApiUsuarios>
}