package com.jorgefernandez3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorgefernandez3.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

	
}
