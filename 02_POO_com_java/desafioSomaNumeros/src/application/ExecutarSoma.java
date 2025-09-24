package application;

import entities.SomaNumeros;

public class ExecutarSoma {

	public static void main(String[] args) {
		
		SomaNumeros somaNum = new SomaNumeros();
		somaNum.adicionarNumero(5);
		somaNum.adicionarNumero(0);		
		somaNum.adicionarNumero(0);
		somaNum.adicionarNumero(3);
		somaNum.adicionarNumero(-1);
		System.out.println("Soma: "+somaNum.calcularSoma());
		System.out.println("Maior número: "+somaNum.encontrarMaiorNumero());
		System.out.println("Menor número: "+somaNum.encontrarMenorNumero());
		somaNum.exibirNumeros();
	}
}