package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExecutarFunction {

	public static void main(String[] args) {
		/*
		 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. 
		 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
		 */
		
		// criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		// usar a function com expressão lambda para dobrar todos os valores
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		// usar a função para dobrar todos os números no Stream e armazená-los em outra lista
		List<Integer> numerosDobrados = numeros.stream()
				.map(dobrar)
				.toList();
		
		// imprimir a lista de números dobrados
		numerosDobrados.forEach(n -> System.out.println(n));
	}
}