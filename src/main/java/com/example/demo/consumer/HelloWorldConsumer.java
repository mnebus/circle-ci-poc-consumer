package com.example.demo.consumer;


import com.example.demo.HelloWorld;

public class HelloWorldConsumer {

	public static void main(String[] args) {
		HelloWorldConsumer hw = new HelloWorldConsumer();
		System.out.println(hw.useHelloWorldClass());
	}

	public String useHelloWorldClass() {
		HelloWorld hw = new HelloWorld();
		return hw.sayHello();
	}
}
