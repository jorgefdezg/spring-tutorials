package com.jorgefernandez3.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jorgefernandez3.DemoConsolaApplication;

//Esta anotacion se usa en la capa de acceso a datos
@Repository
@Qualifier("Persona2")
public class PersonaRepoImpl2 implements IPersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	
	@Override
	public void registrar(String nombre) {
		LOG.info("Se eliminó a " + nombre);
	}

}
 