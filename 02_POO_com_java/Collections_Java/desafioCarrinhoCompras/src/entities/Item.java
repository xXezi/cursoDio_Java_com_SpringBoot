package entities;

public class Item {

	private String nome;
	private double preco;
	private int quantide;
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantide = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantide() {
		return quantide;
	}

	public void setQuantide(int quantide) {
		this.quantide = quantide;
	}

	@Override
	public String toString() {
		return "\nItem nome= " + nome + ", preco= " + String.format("%.2f", preco)+ ", quantide= " + quantide;
	}	
}