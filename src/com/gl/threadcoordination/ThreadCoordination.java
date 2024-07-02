package com.gl.threadcoordination;

public class ThreadCoordination {
	public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread thread1 = new Thread(new Producer(sharedObject));
        Thread thread2 = new Thread(new Consumer(sharedObject));

        thread1.start();
        thread2.start();
    }
}

class SharedObject {
    private boolean isDataProduced = false;
    private int data;

    public synchronized void produce(int value) {
        while (isDataProduced) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        isDataProduced = true;
        notify(); 
    }

    public synchronized void consume() {
        while (!isDataProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        isDataProduced = false;
        notify(); 
    }
}

class Producer implements Runnable {
    private SharedObject sharedObject;

    public Producer(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedObject.produce(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedObject sharedObject;

    public Consumer(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedObject.consume();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




	


