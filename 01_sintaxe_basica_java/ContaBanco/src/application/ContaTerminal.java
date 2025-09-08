package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int number = 0;
		double balance = 0.0;
		String name = "";
		String agency = "";
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);				
			
			System.out.println("Por favor, digite o numero de sua conta: ");
			number = sc.nextInt();
			
			System.out.println("Por favor, digite o número de sua agencia: ");
			sc.nextLine();
			agency = sc.nextLine();
			
			System.out.println("Por favor, digite seu nome: ");			
			name = sc.nextLine();
			
			System.out.println("Por favor, digite o saldo da conta R$ ");	
			balance = sc.nextDouble();
		
			System.out.println("\nOlá "+name+", obrigado por criar uma conta em nosso banco, sua agência é "+agency+", conta "+ number+" e seu saldo "+String.format("R$ %.2f", balance) +" já está disponível para saque.");
		sc.close();
	}
}