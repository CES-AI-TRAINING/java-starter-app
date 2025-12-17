package com.labs.copilot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test class for {@link JavaStarterAppApplication}.
 * <p>
 * This test class runs integration tests with a full Spring Boot context
 * and a running web server on a defined port. It verifies end-to-end
 * functionality including context loading, bean creation, and endpoint behavior.
 * </p>
 * 
 * @author CES AI Training
 * @version 1.0
 * @since 1.0
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class IntegrationTests {

  @Autowired
  private ApplicationContext applicationContext;

  @Autowired
  private JavaStarterAppApplication controller;

  @Test
  void testApplicationContextLoads() {
    assertNotNull(applicationContext);
  }

  @Test
  void testControllerBeanExists() {
    assertNotNull(controller);
  }

  @Test
  void testWelcomeEndpointReturnsCorrectValue() {
    String result = controller.welcome();
    assertEquals("Welcome to Java Starter App!", result);
  }

  @Test
  void testWelcomeEndpointNotEmpty() {
    String result = controller.welcome();
    assertFalse(result.isEmpty());
  }

  @Test
  void testWelcomeEndpointContainsExpectedText() {
    String result = controller.welcome();
    assertTrue(result.contains("Welcome"));
    assertTrue(result.contains("Java"));
    assertTrue(result.contains("Starter"));
  }
}
