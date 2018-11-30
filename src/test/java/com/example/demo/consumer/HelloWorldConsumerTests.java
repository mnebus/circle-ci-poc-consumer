package com.example.demo.consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldConsumerTests {

	private HelloWorldConsumer helloWorld;

	@BeforeEach
	void beforeEach() {
		helloWorld = new HelloWorldConsumer();
	}

	@Test
	public void useHelloWorld() {
		Assertions.assertEquals("Hello, World!",helloWorld.useHelloWorldClass());
	}

}
