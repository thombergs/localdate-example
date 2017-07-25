package com.example.localdateexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Initializer implements ApplicationRunner {

	private PersonRepository personRepository;

	@Autowired
	public Initializer(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Person tom = new Person();
		tom.setName("Tom");
		tom.setBirthdate(LocalDate.of(1982, 6, 23));
		personRepository.save(tom);
	}
}
