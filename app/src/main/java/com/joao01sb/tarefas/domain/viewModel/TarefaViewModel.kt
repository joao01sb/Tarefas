package com.joao01sb.tarefas.domain.viewModel

import androidx.lifecycle.ViewModel
import com.joao01sb.tarefas.domain.repository.TarefaRepository
import com.joao01sb.tarefas.model.Tarefa

class TarefaViewModel(
    val tarefa: Tarefa? = null,
    private val repository: TarefaRepository
) : ViewModel() {

    suspend fun deletarTarefa(tarefa: Tarefa?) {
        if (tarefa != null) {
            repository.deletarTarefa(tarefa)
            return
        }
        throw java.lang.Exception("Tarefa não selecionada")
    }

}