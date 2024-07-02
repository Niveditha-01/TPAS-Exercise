package com.gl.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	class Task implements Runnable {
	    private int taskId;

	    public Task(int id) {
	        this.taskId = id;
	    }

	    @Override
	    public void run() {
	        System.out.println("Task " + taskId + " started by thread: " + Thread.currentThread().getName());
	        try 
	        {
	        	
	            Thread.sleep(2000);
	        } catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	        System.out.println("Task " + taskId + " completed by thread: " + Thread.currentThread().getName());
	    }
	}

	public class ExecutorThreadPool {
	    public static void main(String[] args) {
	       
	        ExecutorService executor = Executors.newFixedThreadPool(3);
	        for (int i = 1; i <= 5; i++) {
	            Task task = new Task(i);
	            executor.submit(task);
	        }

	        executor.shutdown();
	    }
	}



