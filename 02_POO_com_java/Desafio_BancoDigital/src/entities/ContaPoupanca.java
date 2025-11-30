package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void extratoConta() {
		System.out.println("===Extrato Conta Poupanca===");
		super.imprimirInfosConta();
	}
}
