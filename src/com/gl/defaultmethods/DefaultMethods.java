package com.gl.defaultmethods;

interface Greeting {
	    void greet();
	    default void defaultGreet() {
	        System.out.println("Hello, from default method!");
	    }
	}

	class GreetingImpl implements Greeting {
		
	    @Override
	    public void greet() {
	        System.out.println("Hello, from implemented method!");
	    }
	}

	public class DefaultMethods {
	    public static void main(String[] args) {
	        GreetingImpl greetingImpl = new GreetingImpl();
	        greetingImpl.defaultGreet();
	    }
	}


