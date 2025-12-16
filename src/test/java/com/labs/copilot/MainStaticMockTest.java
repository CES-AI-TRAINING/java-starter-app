package com.labs.copilot;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;

import static org.junit.jupiter.api.Assertions.*;

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
