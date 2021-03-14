package com.debugchaos.spring4rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class PersonController {

	@Autowired
	PersonService personService;
	
	@RequestMapping("/person")
	public Person getPersonDetail(@RequestParam(value = "id",required = false,
	                                                    defaultValue = "0") Integer id) {
	
		Person p = new Person();
		p.setName("Prateek");
		return p;
	}
	
	@RequestMapping("/dog")
	public Person getDogDetail(@RequestParam(value = "id",required = false,
	                                                    defaultValue = "0") Integer id) {
		Person p = new Person();
		p.setName("Oscar");
		p.setId(id);
		return p;
	}
	
	@RequestMapping("/cat")
	public Person getcatDetail(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {

		personService.printMessage("Calling CAT method");

		Person p = new Person();
		p.setName("Meow");
		p.setId(7);
		return p;
	}
	
	@RequestMapping("/fish")
	public Person getFishDetail(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {

		personService.printMessage("Calling Fish method");

		Person p = new Person();
		p.setName("Starfish2");
		p.setId(id);
		p.setLocation("debug");
		return p;
	}

	@RequestMapping("/fish2")
	public Person getFishDetail2(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {

		personService.printMessage("Calling Fish method");

		Person p = new Person();
		p.setName("StarfishNewMetho");
		p.setId(id);
		p.setLocation("debug");
		return p;
	}
} 
