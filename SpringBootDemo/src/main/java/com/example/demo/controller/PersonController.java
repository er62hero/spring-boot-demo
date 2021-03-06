package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PersonController {
	private final PersonService personService;

	@RequestMapping(path = "person", method = RequestMethod.GET)
	public Person getPerson() {
		return this.personService.getPerson();
	}

	@RequestMapping(path = "person2", method = RequestMethod.GET)
	public Person getPerson2() {
		return this.personService.getPerson2();
	}

}
