package application;

import entities.EstoqueProdutos;

public class ExecutarEstoque {

	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
		estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
		estoque.adicionarProduto(4L, "Produto D", 2, 20.0);
		
		estoque.exibirProdutos();
		System.out.printf("Valor total estoque R$ %.2f",estoque.calcularValorTotalEstoque());
		System.out.println("\nProduto mais caro R$ "+estoque.obterProdutoMaisCaro());
	}
}