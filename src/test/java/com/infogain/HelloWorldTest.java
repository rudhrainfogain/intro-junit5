package com.infogain;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
    void helloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld("Rudhra"));
    }

}
