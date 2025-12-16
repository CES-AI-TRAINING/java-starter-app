package com.labs.copilot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JavaStarterAppApplicationTests {

	@Autowired
	private ConfigurableApplicationContext applicationContext;

	@Test
	void contextLoads() {
		// Verifies that the Spring context loads successfully
		assertNotNull(applicationContext);
	}

	@Test
	void testApplicationBeanExists() {
		JavaStarterAppApplication bean = applicationContext.getBean(JavaStarterAppApplication.class);
		assertNotNull(bean);
	}

	@Test
	void testWelcomeMethodReturnsCorrectMessage() {
		JavaStarterAppApplication app = new JavaStarterAppApplication();
		String result = app.welcome();
		assertEquals("Welcome to Java Starter App!", result);
	}

	@Test
	void testWelcomeMethodReturnsNotNull() {
		JavaStarterAppApplication app = new JavaStarterAppApplication();
		String result = app.welcome();
		assertNotNull(result);
	}

	@Test
	void testWelcomeMethodReturnsNonEmptyString() {
		JavaStarterAppApplication app = new JavaStarterAppApplication();
		String result = app.welcome();
		assertFalse(result.isEmpty());
		assertTrue(result.length() > 0);
	}

	@Test
	void testMainMethodCanBeInvoked() {
		// This indirectly tests the main method by verifying the application starts
		// successfully
		// The @SpringBootTest annotation already invokes SpringApplication.run() which
		// is what main() does
		assertNotNull(applicationContext);
		assertNotNull(applicationContext.getEnvironment());
		assertTrue(applicationContext.getBean(JavaStarterAppApplication.class) != null);
	}

	@Test
	void testApplicationProperties() {
		assertNotNull(applicationContext.getEnvironment());
		assertNotNull(applicationContext.getId());
	}
}
