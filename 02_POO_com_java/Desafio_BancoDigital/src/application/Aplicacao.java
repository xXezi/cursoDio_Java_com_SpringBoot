package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Aplicacao {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Xezi");
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(100.0);
		
		Conta cp = new ContaPoupanca(c1);
		cc.transferir(90.0, cp);
		
		cc.extratoConta();
		cp.extratoConta();
	}
}