package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod,nome,preco,quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<Produto>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		
		return produtosPorPreco;
	}
}