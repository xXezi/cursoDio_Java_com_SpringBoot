package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Alunos> alunosSet;

	public GerenciadorAlunos() {
		this.alunosSet = new HashSet<Alunos>();
	}
	
	public void adicionarAluno(String nome, long matricula, double media) {
		alunosSet.add(new Alunos(nome, matricula, media));
	}
	
	public Set<Alunos> exibirAlunosPorNome(){
		Set<Alunos> alunosPorNome = new TreeSet<Alunos>(alunosSet);
		if(!alunosSet.isEmpty()) {
			return alunosPorNome;
		}
		else {
			throw new RuntimeException("Lista de alunos está vazia.");
		}
	}
	
	public Set<Alunos> exibirAlunosPorNota(){
		Set<Alunos> alunosPorNota = new TreeSet<Alunos>(new ComparatorPorNota());
		if(!alunosSet.isEmpty()) {
			alunosPorNota.addAll(alunosSet);
			return alunosPorNota;
		}
		else {
			throw new RuntimeException("Lista de alunos está vazia.");
		}
	}
	
	public void exibirAlunos() {
		if(!alunosSet.isEmpty()) {
			System.out.println(alunosSet);
		}
		else {
			throw new RuntimeException("Lista de alunos está vazia.");
		}
	}
	
	public Set<Alunos> removerAluno(long matricula){
		if(!alunosSet.isEmpty()) {
			for(Alunos a : alunosSet) {
				if(a.getMatricula() == matricula) {
					alunosSet.remove(a);
					System.out.println("Aluno '"+a.getNome()+ "' removido.");
					break;
				}
			}
			return alunosSet;
		}
		else {
			throw new RuntimeException("Lista de alunos está vazia.");
		}
	}
}