package br.com.williamdev.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.williamdev.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	

}
