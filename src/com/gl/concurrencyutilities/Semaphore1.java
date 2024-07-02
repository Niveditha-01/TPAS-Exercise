package com.gl.concurrencyutilities;

import java.util.concurrent.Semaphore;

	public class Semaphore1 {
	    public static void main(String[] args) {
	    
	        Semaphore semaphore = new Semaphore(1);
	        Thread thread1 = new Thread(new Worker(semaphore, "Thread-1"));
	        Thread thread2 = new Thread(new Worker(semaphore, "Thread-2"));
	        Thread thread3 = new Thread(new Worker(semaphore, "Thread-3"));

	        thread1.start();
	        thread2.start();
	        thread3.start();
	    }
}

	class Worker implements Runnable {
	    private final Semaphore semaphore;
	    private final String name;

	    public Worker(Semaphore semaphore, String name) {
	        this.semaphore = semaphore;
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        try {
	            semaphore.acquire();
	            System.out.println(name + " acquired a permit");

	            Thread.sleep((long) (Math.random() * 2000));

	            System.out.println(name + " releasing the permit");
	            semaphore.release();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}



