package com.gl.completablefuture;

import java.util.concurrent.CompletableFuture;


public class CompletableFutureCombine {
    public static void main(String[] args) {
       
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 20;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 30;
        });

        
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2);

        combinedFuture.thenAccept(result -> System.out.println("Combined Result: " + result));

        
        try {
            Thread.sleep(4000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



