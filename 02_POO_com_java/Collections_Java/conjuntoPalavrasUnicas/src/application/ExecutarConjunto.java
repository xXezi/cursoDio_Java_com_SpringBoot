package application;

import entities.ConjuntoPalavrasUnicas;

public class ExecutarConjunto {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjPalavras = new ConjuntoPalavrasUnicas();

		conjPalavras.removerPalavra("Maçã");
		
		conjPalavras.adicionarPalavra("Texto");		
		conjPalavras.adicionarPalavra("Paz");
		conjPalavras.adicionarPalavra("Maçã");
		conjPalavras.adicionarPalavra("Paz");
		
		conjPalavras.exibirPalavrasUnicas();
		
		conjPalavras.removerPalavra("Maçã");
		conjPalavras.exibirPalavrasUnicas();
		
		conjPalavras.removerPalavra("Pedra");
		
		conjPalavras.verificarPalavra("Maçã");
		conjPalavras.verificarPalavra("Paz");			
	}
}