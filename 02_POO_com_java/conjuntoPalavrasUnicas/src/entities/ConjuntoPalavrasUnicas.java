package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicas = new HashSet<String>();
	}			

	@Override
	public int hashCode() {
		return Objects.hash(palavrasUnicas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(palavrasUnicas, other.palavrasUnicas);
	}
		
	public void adicionarPalavra(String palavra){				
		if(!palavra.isEmpty()) {			
			palavrasUnicas.add(palavra);
		}
		else {
			throw new RuntimeException("Por favor, adicione uma palavra.");
		}			
	}
		
	public void removerPalavra(String palavra){		
		if(!palavrasUnicas.isEmpty()) {
			if(palavrasUnicas.contains(palavra)) {
				palavrasUnicas.remove(palavra);
			}
			else {				
				System.out.println("Não existe a palavra ["+palavra+"] no conjunto para removê-la.");
			}
		}
		else {
			System.out.println("O conjunto está vazio.");			
		}							
	}
	
	public void verificarPalavra(String palavra) {		
		if(!palavrasUnicas.isEmpty()) {
			if(palavrasUnicas.contains(palavra)) {				
				System.out.println("A palavra ["+palavra+"] está presente no conjunto.");
			}
			else {				
				System.out.println("Não existe a palavra ["+palavra+"] no conjunto.");
			}
		}
		else {
			System.out.println("O conjunto está vazio.");	
		}			
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavrasUnicas);
	}
}