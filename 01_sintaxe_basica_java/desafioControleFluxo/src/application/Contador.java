package application;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parametro: ");
		int paramUm = sc.nextInt();
		
		System.out.println("Digite o segundo parametro: ");
		int paramDois = sc.nextInt();
		
		try {
			contar(paramUm, paramDois);
		}
		catch(Exception e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		sc.close();
	}
	
	static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
		if(paramUm > paramDois) {
			throw new ParametrosInvalidosException();
		}
		else {
			int contagem = paramDois - paramUm;
			
			for(int i = paramUm; i <= paramDois; i++) {
				System.out.println("Imprimindo o numero: "+i);
			}
			System.out.println("\nO total de interações foi de: "+contagem);
		}
	}
}