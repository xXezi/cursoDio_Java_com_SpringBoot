package aplicacao;

import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Aplicacao {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Angular");
		curso2.setDescricao("descrição do curso Angular");
		curso2.setCargaHoraria(3);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria do Java");
		mentoria.setDescricao("Descrição da mentória Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria);
		
	}
}