package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class ViewModelFlowComposeFireBase {

    private val _myDataFlow = MutableStateFlow("")

    val myDataFlow: Flow<String>
        get() = _myDataFlow

    fun updateData() {
        // Simulate a network request
            _myDataFlow.value = "New Data"
        }
    }
