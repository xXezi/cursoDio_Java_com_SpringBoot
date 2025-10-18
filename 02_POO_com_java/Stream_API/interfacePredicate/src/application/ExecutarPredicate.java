package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExecutarPredicate {

	public static void main(String[] args) {
		/*
		 *  Representa uma função que aceita um argumento do tipo T e retorna um 
		 *  valor booleano (verdadeiro ou falso). É comumente usada para filtrar 
		 *  os elementos do Stream com base em alguma condição.
		 */
		
		// criar uma lista de palavras
		List<String> palavras = Arrays.asList("Python","Java","Go","C","Ruby","JavaScript","Kotlin");
		
		// criar um predicate que verifica se a palavra tem mais de 5 caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		// usar o stream para filtrar as palavras com mais de 5 caracteres e em seguida
		// imprimir cada palavra que passou no filtro
		palavras.stream()
			.filter(maisDeCincoCaracteres)
			.forEach(p -> System.out.println(p));	
	}
}