package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExecutarBinary {

	public static void main(String[] args) {
		/*
		 * Representa uma operação que combina dois argumentos do tipo T 
		 * e retorna um resultado do mesmo tipo T. É usada para realizar 
		 * operações de redução em pares de elementos, como somar números ou combinar objetos.
		 */
		
		// cria uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		// usar o binaryoperator com expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = (n1,n2) -> n1 + n2;
		
		// usar o binaryoperator para somar todos os números do Stream
		int resultado = numeros.stream()
				.reduce(0, somar);
		
		// imprimir o resultado da soma
		System.out.println("A soma é: "+resultado);
	}
}