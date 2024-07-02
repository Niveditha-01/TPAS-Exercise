package com.gl.threadcoordination;
	

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        final int numThreads = 3;
        CountDownLatch latch = new CountDownLatch(numThreads);
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        for (int i = 0; i < numThreads; i++) {
            executor.submit(new Worker(latch, "Thread-" + (i + 1)));
        }

        latch.await();
        System.out.println("All threads have completed their tasks.");

        executor.shutdown();
    }
}

class Worker implements Runnable {
    private final CountDownLatch latch;
    private final String name;

    public Worker(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep((long) (Math.random() * 2000));
            System.out.println(name + " completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); 
        }
    }
}
	    