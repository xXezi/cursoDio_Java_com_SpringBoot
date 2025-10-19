package application;

import java.util.Arrays;
import java.util.List;

public class Desafio_2 {

	public static void main(String[] args) {
		/*
		 * Desafio 2 - Imprima a soma dos números pares da lista: 
		 * 
		 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
		 */
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// removendo valores repetidos (distinct)
		// filtrando pelos números pares (filter)
		// realizando a soma no final (reduce)
		int result = numeros.stream()
				.distinct()
				.filter(n -> n % 2 == 0)
				.reduce(0, (n1,n2) -> n1 + n2);

		
		// imprimindo o resultado
		System.out.println("Soma dos números pares da lista: "+result);
	}
}