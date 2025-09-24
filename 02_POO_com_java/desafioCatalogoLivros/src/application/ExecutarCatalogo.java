package application;

import entities.CatalogoLivros;

public class ExecutarCatalogo {

	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
	}
}