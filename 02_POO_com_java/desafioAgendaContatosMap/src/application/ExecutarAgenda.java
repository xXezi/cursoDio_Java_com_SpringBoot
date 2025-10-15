package application;

import entities.AgendaContatos;

public class ExecutarAgenda {
	public static void main(String[] args) {
			
		AgendaContatos agendaContatos = new AgendaContatos();
	    agendaContatos.adicionarContato("Camila", 123456);
	    agendaContatos.adicionarContato("João", 5665);
	    agendaContatos.adicionarContato("Carlos", 1111111);
	    agendaContatos.adicionarContato("Ana", 654987);
	    agendaContatos.adicionarContato("Maria", 1111111);
	    agendaContatos.adicionarContato("Camila", 44444);
	    agendaContatos.exibirContatos();
	    agendaContatos.removerContato("Maria");
	    agendaContatos.exibirContatos();
	    String nomePesquisa = "João";
	    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
	    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
	    String nomePesquisaNaoExistente = "Paula";
	    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
	    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
	}
}
