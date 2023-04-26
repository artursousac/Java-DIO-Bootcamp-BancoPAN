package com.example.dioclass.apirest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository repository) {
		return args -> {
			repository.save(new Person("João", "Silva"));
			repository.save(new Person("Artur", "Cavalcante"));
		};
	}

}
