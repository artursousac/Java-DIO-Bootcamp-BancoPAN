package com.example.dioclass.apirest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	//Onde ficam os atributos e métodos
	private final PersonRepository repositoryPerson;
	
	public PersonController(PersonRepository repository) {
		this.repositoryPerson = repository;
	}
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello you are using spring boot! This ir your first controller method.";
	}
	
	@GetMapping("/persons")
	public List<Person> personFindAll() {
		return repositoryPerson.findAll();
	}
	
	@GetMapping("/persons/{id}")
	public Optional personFindById(@PathVariable Long id) {
		//Optional foi criada quando não tem ponteiro existente.
		return repositoryPerson.findById(id);
	}
}
