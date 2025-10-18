package application;

import entities.Dicionario;

public class ExecutarDicionario {

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();		
		
		dicionario.adicionarPalavra("Xezi", "usuário github");
		dicionario.adicionarPalavra("Maçã", "uma fruta");
		dicionario.adicionarPalavra("Caneta", "objeto feito para escrever");
		
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("Maçã");
		
		dicionario.exibirPalavras();
		
		System.out.println(dicionario.pesquisarPorPalavra("Xezi"));
	}
}