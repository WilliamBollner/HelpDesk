package br.com.williamdev.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.williamdev.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

	

}
