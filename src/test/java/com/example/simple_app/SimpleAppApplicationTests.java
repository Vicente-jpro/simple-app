package com.example.simple_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SimpleAppApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		// Verify that the controller is loaded in the application context
		assertThat(helloController).isNotNull();
	}

	@Test
	void testHelloEndpointIntegration() {
		String url = "http://localhost:" + port + "/";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).isEqualTo("Hello from simple_app!");
	}

	@Test
	void testApplicationStarts() {
		// This test ensures the Spring Boot application context loads successfully
		assertThat(port).isGreaterThan(0);
	}
}
