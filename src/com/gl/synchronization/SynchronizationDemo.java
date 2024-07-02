package com.gl.synchronization;

class Counter {
		
	    private int count = 0;
	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }
	}

	class IncrementTask implements Runnable {
	    private Counter counter;
	    private int increments;

	    public IncrementTask(Counter counter, int increments) {
	        this.counter = counter;
	        this.increments = increments;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < increments; i++) {
	            counter.increment();
	        }
	    }
	}

	public class SynchronizationDemo {
	    public static void main(String[] args) throws InterruptedException {
	        Counter counter = new Counter();

	        Thread thread1 = new Thread(new IncrementTask(counter, 30000));
	        Thread thread2 = new Thread(new IncrementTask(counter, 10000));

	        thread1.start();
	        thread2.start();

	        thread1.join();
	        thread2.join();

	        System.out.println("Final counter value: " + counter.getCount());
	    }
	}



