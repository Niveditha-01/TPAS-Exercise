package com.gl.java;

public class LambdaRunnable {
	    public static void main(String[] args) {
	        Runnable task = () -> System.out.println("Hello, World!");
	        Thread thread = new Thread(task);
	        thread.start();
	    }
	}


