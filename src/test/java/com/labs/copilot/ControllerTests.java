package com.labs.copilot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ControllerTests {

  private JavaStarterAppApplication controller;

  @BeforeEach
  void setUp() {
    controller = new JavaStarterAppApplication();
  }

  @Test
  void testWelcomeReturnsNotNull() {
    String result = controller.welcome();
    assertNotNull(result);
  }

  @Test
  void testWelcomeReturnsCorrectMessage() {
    String result = controller.welcome();
    assertEquals("Welcome to Java Starter App!", result);
  }

  @Test
  void testWelcomeReturnsNonEmptyString() {
    String result = controller.welcome();
    assertFalse(result.isEmpty());
  }

  @Test
  void testWelcomeMessageContainsKeyword() {
    String result = controller.welcome();
    assertTrue(result.contains("Welcome"));
    assertTrue(result.contains("Java"));
    assertTrue(result.contains("Starter App"));
  }
}
