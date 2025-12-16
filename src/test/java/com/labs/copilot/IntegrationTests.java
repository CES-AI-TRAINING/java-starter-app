package com.labs.copilot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

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
