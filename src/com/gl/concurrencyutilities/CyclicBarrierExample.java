package com.gl.concurrencyutilities;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	    public static void main(String[] args) {
	        final int numThreads = 3;
	        CyclicBarrier barrier = new CyclicBarrier(numThreads, () -> {
	            System.out.println("All threads reached the barrier point");
	        });

	        Thread thread1 = new Thread(new Task(barrier, "Thread-1"));
	        Thread thread2 = new Thread(new Task(barrier, "Thread-2"));
	        Thread thread3 = new Thread(new Task(barrier, "Thread-3"));

	        thread1.start();
	        thread2.start();
	        thread3.start();
	    }
	}

	class Task implements Runnable {
	    private final CyclicBarrier barrier;
	    private final String name;

	    public Task(CyclicBarrier barrier, String name) {
	        this.barrier = barrier;
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        try {
	            System.out.println(name + " is waiting at the barrier point");
	            barrier.await();

	            System.out.println(name + " has crossed the barrier point");
	        } catch (InterruptedException | BrokenBarrierException e) {
	            e.printStackTrace();
	        }
	    }
	}



