package se.magnus.microservices.core.review;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MyContainerTest {
    
    @Container
    public GenericContainer<?> container = new GenericContainer<>("alpine")
        .withCommand("sleep", "300");
    
    @Test
    public void testContainerIsRunning() {
        assertTrue(container.isRunning());
    }
}
