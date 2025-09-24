package entities;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> listInteiros = new ArrayList<Integer>();

	public SomaNumeros() {
	}
	
	public void adicionarNumero(int numero) {
		listInteiros.add(numero);
	}
	
	public int calcularSoma() {
		int somaValoresList = 0;
		if(!listInteiros.isEmpty()) {
			for(int i = 0; i < listInteiros.size();i++) {
				somaValoresList += listInteiros.get(i);
			}
		}
		else {
			throw new RuntimeException("A lista está vazia.");
		}
		return somaValoresList;
	}
	
	public int encontrarMaiorNumero() {
		int maiorValor = 0;
		if(!listInteiros.isEmpty()) {
			for(int i = 0; i < listInteiros.size();i++) {
				if(listInteiros.get(i) > maiorValor) {
					maiorValor = listInteiros.get(i);
				}
			}
		}
		else {
			throw new RuntimeException("A lista está vazia.");
		}
		return maiorValor;
	}
	
	public int encontrarMenorNumero() {
		int menorValor = 0;
		if(!listInteiros.isEmpty()) {
			for(int i = 0; i < listInteiros.size();i++) {
				if(listInteiros.get(i) < menorValor) {
					menorValor = listInteiros.get(i);					
				}
			}
		}
		else {
			throw new RuntimeException("A lista está vazia.");
		}
		return menorValor;
	}
	
	public void exibirNumeros(){
		if(!listInteiros.isEmpty()) {
			for(int i = 0; i < listInteiros.size();i++) {
				System.out.print(listInteiros.get(i)+" ");
			}
		}
		else {
			throw new RuntimeException("A lista está vazia.");
		}
	}
}