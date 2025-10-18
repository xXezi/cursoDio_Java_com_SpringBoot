package application;

import entities.GerenciadorAlunos;

public class ExecutarLista {

	public static void main(String[] args) {
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("Xezi", 1234, 5.5);
		alunos.adicionarAluno("Pedro", 234, 8.5);
		alunos.adicionarAluno("Marcos", 14, 4d);
		alunos.adicionarAluno("Almeida", 94, 9d);
		alunos.adicionarAluno("Oliveira", 14, 4d);
		alunos.adicionarAluno("Manuel Santos", 33314, 4d);
		
		System.out.println(alunos.exibirAlunosPorNome());
		System.out.println(alunos.exibirAlunosPorNota());
		alunos.exibirAlunos();
		
		alunos.removerAluno(234);
		
		alunos.exibirAlunos();
		
		alunos.removerAluno(33314);
		
		alunos.exibirAlunos();
	}
}