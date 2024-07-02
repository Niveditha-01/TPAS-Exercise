package com.gl.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture1 {
	    public static void main(String[] args) {
	    	
	        CompletableFuture<String> future = CompletableFuture.completedFuture("Hello, CompletableFuture!");

	        String result = future.join(); 
	        System.out.println("Result from CompletableFuture: " + result);
	    }
	}



