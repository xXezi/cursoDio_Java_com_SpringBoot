package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		if(!this.itemList.isEmpty()) {
			Iterator var1 = this.itemList.iterator();
			
			while(var1.hasNext()) {
				Item i = (Item) var1.next();
				if(i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);
				}
			}
			this.itemList.removeAll(itensParaRemover);
		}
		else {
			System.out.println("A lista está vazia.");
		}
		
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemList.remove(i);
			}
		}
	}
	
	public void calcularValorTotal() {
		double somaValor = 0.0;
		
		if(this.itemList.isEmpty()) {
			throw new RuntimeException("A lista está vazia.");
		}
		else {
			for(Item i : itemList) {
				somaValor += i.getPreco() * i.getQuantide();
			}
			System.out.println("\nValor total do carrinho R$ "+String.format("%.2f", somaValor));
		}
	}
	
	public void exibirItens() {
		
		if(!this.itemList.isEmpty()) {
			System.out.println(this.itemList);
		}
		else {
			System.out.println("A lista está vazia");
		}
	}
}