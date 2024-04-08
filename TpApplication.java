package com.devops.tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Bonjour, ceci est une application Java Web conteneurisée avec Docker et déployée avec Jenkins!";
	}
}
