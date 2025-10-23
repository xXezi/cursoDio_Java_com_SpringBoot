package application;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio_7 {

	public static void main(String[] args) {
		/*
		 * Desafio 7 - Encontrar o segundo número maior da lista:
		 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
		 */

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3).stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.toList();
				
		System.out.println(numeros.get(1));		
	}
}