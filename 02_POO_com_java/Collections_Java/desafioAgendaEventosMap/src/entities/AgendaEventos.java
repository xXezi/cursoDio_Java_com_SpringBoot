package entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<LocalDate, Evento>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {		
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<LocalDate, Evento>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();		
		Map<LocalDate, Evento> eventrosTreeMap = new TreeMap<LocalDate, Evento>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventrosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O próximo evento: "+entry.getValue()+" acontecerá nada data "+entry.getKey());
				break;
			}
		}
	}	
}