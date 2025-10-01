package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{

	private List<Integer> numeroList = new ArrayList<>();

	public OrdenacaoNumeros() {
	}	
	
	public List<Integer> getNumeroList() {
		return numeroList;
	}

	public void adicionarNumero(int numero) {
		this.numeroList.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> ordemAscendente = new ArrayList<>(getNumeroList());
		if(!this.numeroList.isEmpty()) {
			
			Collections.sort(ordemAscendente);
			return ordemAscendente;
		}
		else{
			throw new RuntimeException("A lista está vazia.");
		}
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> ordemDescendente = new ArrayList<>(getNumeroList());
		if(!this.numeroList.isEmpty()) {
			ordemDescendente.sort(Collections.reverseOrder());
			return ordemDescendente;
		}
		else{
			throw new RuntimeException("A lista está vazia.");
		}
	}

	public void exibirLista() {
		if(!this.numeroList.isEmpty()) {
			System.out.println(this.numeroList);
		}
		else {
			System.out.println("A lista está vazia");
		}
	}
}