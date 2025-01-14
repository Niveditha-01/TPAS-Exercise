package com.gl.predicatedemo;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {		
		ConsumerDemo consumerDemo = new ConsumerDemo();
		consumerDemo.squareInt(5);
	
		Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing operation");
		squareMe.accept(5);
	}
   
	public void squareInt(int i) {
		int squared = i*i;
		System.out.println("Squared number is "+ squared);

	}

}
