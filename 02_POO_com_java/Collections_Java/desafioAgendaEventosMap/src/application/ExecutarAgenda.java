package application;

import java.time.LocalDate;
import java.time.Month;

import entities.AgendaEventos;

public class ExecutarAgenda {

	public static void main(String[] args) {
		AgendaEventos agenda = new AgendaEventos();
		
		agenda.adicionarEvento(LocalDate.of(2025, Month.JULY, 15), "Evento 1", "Atração 1");
		agenda.adicionarEvento(LocalDate.of(2025, 7, 9), "Evento 2", "Atração 2");
		agenda.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
//		agenda.adicionarEvento(LocalDate.of(2025, Month.OCTOBER, 16), "Evento 4", "Atração 4");
		agenda.adicionarEvento(LocalDate.of(2025, Month.OCTOBER, 17), "Evento 5", "Atração 5");
		agenda.adicionarEvento(LocalDate.of(2026, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");
		
		agenda.exibirAgenda();
		
		agenda.obterProximoEvento();
	}
}