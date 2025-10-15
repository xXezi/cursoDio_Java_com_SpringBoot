package entities;

import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
	private String nome;
	private long matricula;
	private double nota;
	
	public Alunos(String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "{nome=" + nome + ", matricula=" + matricula + ", nota=" + String.format("%.1f", nota) + "}";
	}

	@Override
	public int compareTo(Alunos a) {
		return nome.compareToIgnoreCase(a.getNome());
	}	
}