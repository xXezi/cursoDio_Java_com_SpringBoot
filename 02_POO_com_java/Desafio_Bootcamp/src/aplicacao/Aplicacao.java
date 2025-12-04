package aplicacao;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
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
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devXezi = new Dev();
		devXezi.setNome("Xezi");
		devXezi.inscreverBootcamp(bootcamp);		
		System.out.println("Conteúdos incritos Xezi "+devXezi.getConteudosInscritos());		
		devXezi.progredir();
		devXezi.progredir();
		System.out.println("Conteúdos incritos Xezi "+devXezi.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Xezi "+devXezi.getConteudosConcluidos());
		System.out.println("XP: "+devXezi.calcularTotalXp());
		
		System.out.println("=============================");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);		
		System.out.println("Conteúdos incritos João "+devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteúdos incritos João "+devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos João "+devJoao.getConteudosConcluidos());
		System.out.println("XP: "+devJoao.calcularTotalXp());		
	}
}