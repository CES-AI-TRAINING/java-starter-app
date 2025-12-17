package com.labs.copilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Spring Boot application class for the Java Starter App.
 * <p>
 * This class serves as both the application configuration and a REST controller,
 * providing a simple welcome endpoint at the root path.
 * </p>
 * @author CES AI Training
 * @version 1.0
 * @since 1.0
 */
@RestController
@SpringBootApplication
public class JavaStarterAppApplication {

	/**
	 * Handles GET requests to the root endpoint ("/").
	 * <p>
	 * This method returns a simple welcome message to verify that the
	 * application is running correctly.
	 * </p>
	 * @return a welcome message string
	 */
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Java Starter App!";
	}

}
