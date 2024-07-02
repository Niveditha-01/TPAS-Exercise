package com.gl.predicatedemo;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
//		FunctionDemo functionalDemo = new FunctionDemo();
//		System.out.println(functionalDemo.squareInt(5));
		
		Function<Integer, Integer> squareMe = i -> i*i;
		System.out.println("Square of 5 is " + squareMe.apply(5)); 
	}
	
//	public int squareInt(int i) {
//		int squared = i*i;
//		return squared;
//	}

}
