package com.gl.multithreading;

	class MyThread extends Thread {
	    
	    @Override
	    public void run() {
	        System.out.println("MyThread is running...");
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("MyThread: " + i);
	            
	            try 
	            {
	                Thread.sleep(1000); 
	            } catch (InterruptedException e) 
	            {
	                System.out.println(e);
	            }
	        }
	        
	        System.out.println("MyThread finished.");
	    }
	}

	public class CreatingThreads {
	    public static void main(String[] args) {
	    	
	        MyThread thread = new MyThread();
	        thread.start();
	        
	        for (int i = 1; i <= 3; i++)
	        {
	            System.out.println("Main thread: " + i);
	            
	            try 
	            {
	                Thread.sleep(2000); 
	            } catch (InterruptedException e) 
	            {
	                System.out.println(e);
	            }
	        }
	        
	        System.out.println("Main thread finished.");
	    }
	}
