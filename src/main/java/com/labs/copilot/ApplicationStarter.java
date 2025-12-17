package com.labs.copilot;

import org.springframework.boot.SpringApplication;

/**
 * Entry point class for launching the Java Starter App.
 * <p>
 * This class contains the main method that bootstraps the Spring Boot application
 * by delegating to {@link JavaStarterAppApplication}. It serves as an alternative
 * entry point to the application.
 * </p>
 * @author CES AI Training
 * @version 1.0
 * @since 1.0
 */
public class ApplicationStarter {
  
  /**
   * Main method to start the Spring Boot application.
   * <p>
   * This method initializes and runs the Spring Boot application context
   * using the {@link JavaStarterAppApplication} configuration class.
   * </p>
   * @param args command-line arguments passed to the application
   */
  public static void main(String[] args) {
    SpringApplication.run(JavaStarterAppApplication.class, args);
  }
}
