package com.labs.copilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JavaStarterAppApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Java Starter App!";
	}

}
