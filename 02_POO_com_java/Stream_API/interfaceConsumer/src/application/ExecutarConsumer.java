package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExecutarConsumer {

	public static void main(String[] args) {
		/*
		 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. 
		 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do 
		 * Stream sem modificar, ou retornar um valor.
		 */
		
		// criando lista de números inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
		
		// usar o consumer com expressão lambda para imprimir números pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		
		// usar o consumer para imprimir números pares no stream
		numeros.forEach(imprimirNumeroPar);
	}
}