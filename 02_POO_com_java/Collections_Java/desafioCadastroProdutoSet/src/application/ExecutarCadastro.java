package application;

import entities.CadastroProdutos;

public class ExecutarCadastro {

	public static void main(String[] args) {
		CadastroProdutos produto = new CadastroProdutos();
		
		produto.adicionarProduto(1L, "Produto 5", 15d, 5);
		produto.adicionarProduto(2L, "Produto 0", 20d, 10);
		produto.adicionarProduto(1L, "Produto 3", 10d, 2);
		produto.adicionarProduto(9L, "Produto 9", 2d, 2);
		
		System.out.println(produto.exibirProdutosPorNome());
		System.out.println(produto.exibirProdutosPorPreco());
	}
}