package com.labs.copilot;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for testing the main method of {@link ApplicationStarter}.
 * <p>
 * This test class uses Mockito's static mocking capabilities to test the
 * application startup without actually starting a Spring Boot server. This
 * ensures the main method can be invoked without side effects during testing.
 * </p>
 * @author CES AI Training
 * @version 1.0
 * @since 1.0
 */
class MainStaticMockTest {

  @Test
  void testMainDoesNotStartServerWhenMocked() {
    try (MockedStatic<SpringApplication> mocked = Mockito.mockStatic(SpringApplication.class)) {
      ConfigurableApplicationContext fakeContext = Mockito.mock(ConfigurableApplicationContext.class);
      mocked.when(() -> SpringApplication.run(Mockito.eq(JavaStarterAppApplication.class), Mockito.any()))
          .thenReturn(fakeContext);

      assertDoesNotThrow(() -> ApplicationStarter.main(new String[] {}));

    }
  }
}
