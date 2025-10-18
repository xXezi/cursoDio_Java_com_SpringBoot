package application;

import entities.AgendaContato;

public class ExecutarAgenda {

	public static void main(String[] args) {
		AgendaContato agenda = new AgendaContato();
		
		agenda.exibirContatos();
		
		agenda.adicionarContato("Xezi", 123456);
		agenda.adicionarContato("Xezi", 0);
		agenda.adicionarContato("Xezi Brabo", 1231231);
		agenda.adicionarContato("Xezi Ola", 33333);
		agenda.adicionarContato("Marcos S", 567567);
		
		agenda.exibirContatos();
		
		System.out.println(agenda.pesquisarPorNome("Xezi"));
		System.out.println("Contato atualizado: "+agenda.atualizarNumeroContato("Marcos S", 11111111));
	}
}