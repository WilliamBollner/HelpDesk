package br.com.williamdev.helpdesk.domain;

import java.time.LocalDate;

import br.com.williamdev.helpdesk.domain.enums.Prioridade;
import br.com.williamdev.helpdesk.domain.enums.Status;

public class Chamado {

	private int id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observacoes;
	
	
}
