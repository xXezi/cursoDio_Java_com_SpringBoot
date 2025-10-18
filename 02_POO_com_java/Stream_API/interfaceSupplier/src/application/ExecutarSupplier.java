package application;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExecutarSupplier {

	public static void main(String[] args) {
		/*
		 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. 
		 * É comumente usada para criar ou fornecer novos objetos de uma determinado tipo.
		 */
		
		// usar o Supplier com expressão lambda para fornecer uma saudação personalizada
		Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
		
		// usar o Supplier para obter uma lista com 5 saudações
		List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
				.limit(5)
				.toList();
		
		// imprimir saudações geradas
		listaSaudacoes.forEach(n -> System.out.println(n));
	}
}