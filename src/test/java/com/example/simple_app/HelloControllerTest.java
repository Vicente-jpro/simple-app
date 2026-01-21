package com.example.simple_app;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {

    @Test
    void testHelloEndpointReturnsCorrectMessage() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertThat(result).isEqualTo("Hello from simple_app!");
    }

    @Test
    void testHelloEndpointReturnsNonNullValue() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertThat(result).isNotNull();
    }

    @Test
    void testHelloEndpointReturnsNonEmptyString() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertThat(result).isNotEmpty();
    }
}
