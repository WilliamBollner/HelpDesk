package br.com.williamdev.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.williamdev.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	

}
