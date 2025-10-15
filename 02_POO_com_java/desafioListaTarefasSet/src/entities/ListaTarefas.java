package entities;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefas;

	public ListaTarefas() {
		this.tarefas = new HashSet<Tarefa>();
	}
	
	public void adicionarTarefa(String descricao) {			
		tarefas.add(new Tarefa(descricao, false));
	}
	
	public Set<Tarefa> removerTarefa(String descricao){
		if(!tarefas.isEmpty()) {	
			for(Tarefa t : tarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefas.remove(t);
					break;
				}
			}
			return tarefas;		
		}
		else {
			throw new RuntimeException("Lista de tarefas está vazia.");
		}
	}
	
	public void exibirTarefas() {
		if(!tarefas.isEmpty()) {
			System.out.println(tarefas);
		}
		else {
			throw new RuntimeException("Lista de tarefas está vazia.");
		}
	}
	
	public void contarTarefas() {
		if(tarefas.size() > 1) {
			System.out.println("Há "+tarefas.size()+" tarefas em sua lista.");
		}
		else if(tarefas.size() == 1){
			System.out.println("Há "+tarefas.size()+" tarefa em sua lista.");
		}
		else {
			System.out.println("Não existem tarefas em sua lista.");
		}
	}
	
	public void marcarTarefaConcluida(String descricao) {
		if(!tarefas.isEmpty()) {
			for(Tarefa t : tarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setTarefaConcluida(true);
				}
			}
		}
		else {
			throw new RuntimeException("Lista de tarefas está vazia.");
		}
	}
	
	public void marcarTarefaPendente(String descricao){
		if(!tarefas.isEmpty()) {
			for(Tarefa t : tarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setTarefaConcluida(false);
				}
			}
		}
		else {
			throw new RuntimeException("Lista de tarefas está vazia.");
		}
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
		if(!tarefas.isEmpty()) {
			for(Tarefa t : tarefas) {
				if(t.isTarefaConcluida()) {
					tarefasConcluidas.add(t);
				}
			}
			if(!tarefasConcluidas.isEmpty()) {				
				return tarefasConcluidas;
			}
			else {
				throw new RuntimeException("Não há tarefas concluídas.");
			}
		}
		else {
			throw new RuntimeException("Lista de tarefas está vazia.");
		}
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<Tarefa>();
		if(!tarefas.isEmpty()) {
			for(Tarefa t : tarefas) {
				if(!t.isTarefaConcluida()) {
					tarefasPendentes.add(t);
				}
			}
			return tarefasPendentes;
		}
		else {
			throw new RuntimeException("Lista de tarefas está vazia.");
		}
	}
	
	public void limparListaTarefas(){
		if(!tarefas.isEmpty()) {
			tarefas.removeAll(tarefas);
			System.out.println("Todas as tarefas foram removidas!");
		}
		else{
			throw new RuntimeException("Lista de tarefas já está vazia.");
		}
	}
}