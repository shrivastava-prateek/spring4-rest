package com.debugchaos.spring4rest;

import org.springframework.stereotype.Component;

@Component
public class PersonService {

	public void printMessage(String message) {
		System.out.println("Received message is: "+ message);
	}
}
