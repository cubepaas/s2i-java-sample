package com.cubepaas.s2i;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello, welcome to the world of container.", new HelloWorldController().sayHello());
    }
}
