package br.com.williamdev.helpdesk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.williamdev.helpdesk.domain.Tecnico;
import br.com.williamdev.helpdesk.domain.dtos.TecnicoDTO;
import br.com.williamdev.helpdesk.repository.TecnicoRepository;
import br.com.williamdev.helpdesk.service.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found. Id: " + id));
	}
	
	public List<Tecnico> findAll(){
		return repository.findAll();
	}

	public Tecnico create(TecnicoDTO objDTO) {
		objDTO.setId(null);
		Tecnico newObj = new Tecnico(objDTO);
		return repository.save(newObj);
	}
	
}
