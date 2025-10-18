package entities;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void exibirPalavras() {
		if(!dicionarioMap.isEmpty()) {
			System.out.println(dicionarioMap);
		}
		else{
			System.out.println("Dicionário está vazio.");
		}
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
		else {
			System.out.println("Dicionário está vazio.");
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			return dicionarioMap.get(palavra);
		}
		else {
			return "Dicionário está vazio.";
		}
	}	
}