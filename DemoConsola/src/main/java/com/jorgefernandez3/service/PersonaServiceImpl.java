package com.jorgefernandez3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jorgefernandez3.repository.IPersonaRepo;

//Esta anotacion se usa en la capa de acceso a logica de negocios	
@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	@Qualifier("Persona2")
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
		
	}
	

}
