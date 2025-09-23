package application;

import entities.CarrinhoDeCompras;

public class ExecutarCarrinho {

	public static void main(String[] args) {	
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
			// teste de exceção
//			carrinhoDeCompras.exibirItens();
//			carrinhoDeCompras.calcularValorTotal();
			carrinhoDeCompras.adicionarItem("Lápis", 2.0, 3);
			carrinhoDeCompras.adicionarItem("Lápis", 2.0, 3);
			carrinhoDeCompras.adicionarItem("Caderno", 35.0, 1);
			carrinhoDeCompras.adicionarItem("Borracha", 2.0, 2);
			carrinhoDeCompras.exibirItens();
			carrinhoDeCompras.removerItem("Lápis");
			carrinhoDeCompras.exibirItens();
			carrinhoDeCompras.calcularValorTotal();
	}
}