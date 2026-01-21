package com.example.simple_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SimpleAppApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		// Verify that the Spring application context loads successfully
	}

	@Test
	void testControllerIsLoadedInContext() {
		// Verify that the controller is loaded in the application context
		assertThat(helloController).isNotNull();
	}

	@Test
	void testControllerHelloMethod() {
		// Verify the controller's hello method returns expected value
		String result = helloController.hello();
		assertThat(result).isEqualTo("Hello from simple_app!");
	}
}
