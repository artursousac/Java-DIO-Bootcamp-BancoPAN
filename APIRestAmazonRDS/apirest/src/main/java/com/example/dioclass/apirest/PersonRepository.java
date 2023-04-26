package com.example.dioclass.apirest;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository é uma classe abstrata que só vai estender.
public interface PersonRepository extends JpaRepository<Person, Long> {

}
