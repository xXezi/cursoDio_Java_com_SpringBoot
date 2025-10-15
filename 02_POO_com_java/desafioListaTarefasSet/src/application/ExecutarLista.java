package application;

import entities.ListaTarefas;

public class ExecutarLista {

	public static void main(String[] args) {
		ListaTarefas tarefa = new ListaTarefas();		
		
		tarefa.contarTarefas();
		
		tarefa.adicionarTarefa("Tarefa um");
		
		tarefa.contarTarefas();
		
		tarefa.adicionarTarefa("Tarefa dois");
		tarefa.adicionarTarefa("Tarefa tres");
		tarefa.adicionarTarefa("Tarefa quatro");
		tarefa.adicionarTarefa("Tarefa cinco");
		
		tarefa.exibirTarefas();
		
		tarefa.removerTarefa("Tarefa um");
		
		tarefa.exibirTarefas();
		
		tarefa.contarTarefas();
		
		tarefa.marcarTarefaConcluida("Tarefa dois");
		tarefa.marcarTarefaConcluida("Tarefa quatro");
		
		System.out.println("***Tarefas concluídas*** \n"+tarefa.obterTarefasConcluidas());
		
		tarefa.marcarTarefaPendente("Tarefa quatro");
		
		System.out.println("***Tarefas pentendes*** \n"+tarefa.obterTarefasPendentes());
		
		tarefa.limparListaTarefas();
		
		tarefa.exibirTarefas();
	}
}