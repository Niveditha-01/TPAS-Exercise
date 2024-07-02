package com.gl.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

		public class CompletableFutureAsync {
		    public static void main(String[] args) {

		        CompletableFuture<Void> runFuture = CompletableFuture.runAsync(() -> {
		            try {
		                Thread.sleep(2000);
		                System.out.println("Running task asynchronously...");
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        });
		        System.out.println("runAsync: " + runFuture.isDone());
		        
		        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(() -> {
		            try {
		                Thread.sleep(2000);
		                System.out.println("Running task asynchronously...");
		                return "Hello";
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		                return "Error";
		            }
		        });
		        try {
		            System.out.println("supplyAsync: " + supplyFuture.get());
		        } catch (InterruptedException | ExecutionException e) {
		            e.printStackTrace();
		        }
		    }		
}

