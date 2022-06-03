package br.com.williamdev.helpdesk.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.williamdev.helpdesk.domain.Chamado;
import br.com.williamdev.helpdesk.domain.Cliente;
import br.com.williamdev.helpdesk.domain.Tecnico;
import br.com.williamdev.helpdesk.domain.enums.Perfil;
import br.com.williamdev.helpdesk.domain.enums.Prioridade;
import br.com.williamdev.helpdesk.domain.enums.Status;
import br.com.williamdev.helpdesk.repository.ChamadoRepository;
import br.com.williamdev.helpdesk.repository.ClienteRepository;
import br.com.williamdev.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instaciaDB() {

		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "123456789", "valdir@gmail.com", "123456789");
		tec1.addPerfil(Perfil.TECNICO);

		Cliente cli1 = new Cliente(null, "Linus Turval", "80527954780", "torvalds@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

	}
}
