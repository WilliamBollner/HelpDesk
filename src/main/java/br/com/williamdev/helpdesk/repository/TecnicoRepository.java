package br.com.williamdev.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.williamdev.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

	

}
