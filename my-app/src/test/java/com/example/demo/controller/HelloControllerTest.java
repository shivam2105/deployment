package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {
    @Test
    void testHello() {
        assertEquals("Hello, World!", new HelloController().sayHello());
    }
}
