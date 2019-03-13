package com.infogain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachDemo {
	  private Greeting greeting;

	    @BeforeEach
	    void setUp() {
	        System.out.println("In Before Each....");
	        greeting = new Greeting();
	    }

	    @Test
	    void helloWorld() {
	        System.out.println(greeting.helloWorld());
	    }

	    @Test
	    void helloWorld1() {
	        System.out.println(greeting.helloWorld("Rudhra"));
	    }
}
