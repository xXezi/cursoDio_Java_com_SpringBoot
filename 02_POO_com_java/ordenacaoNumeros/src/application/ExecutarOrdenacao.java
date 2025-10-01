package application;

import entities.OrdenacaoNumeros;

public class ExecutarOrdenacao {

	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		
		ordenacaoNumeros.adicionarNumero(2);
		ordenacaoNumeros.adicionarNumero(5);
		ordenacaoNumeros.adicionarNumero(4);
		ordenacaoNumeros.adicionarNumero(1);
		ordenacaoNumeros.adicionarNumero(99);
		ordenacaoNumeros.exibirLista();
		
		System.out.println(ordenacaoNumeros.ordenarAscendente());		
		System.out.println(ordenacaoNumeros.ordenarDescendente());
	}
}