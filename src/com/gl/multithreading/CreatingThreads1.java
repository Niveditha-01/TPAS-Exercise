package com.gl.multithreading;

class MyRunnable implements Runnable {
  
		    @Override
		    public void run() {
		        System.out.println("MyRunnable is running...");
		        
		        for (int i = 1; i <= 5; i++) {
		            System.out.println("MyRunnable: " + i);
		            
		            try {
		                Thread.sleep(1000); 
		            } 
		            catch (InterruptedException e) 
		            {
		                System.out.println(e);
		            }
		        }
		        
		        System.out.println("MyRunnable finished.");
		    }
		}

		public class CreatingThreads1 {
		    public static void main(String[] args) {
		    	
		        MyRunnable myRunnable = new MyRunnable();		     
		        Thread thread = new Thread(myRunnable);
		        thread.start();
		        
		        for (int i = 1; i <= 3; i++) 
		        {
		            System.out.println("Main thread: " + i);
		            
		            try 
		            {
		                Thread.sleep(2000); 
		            } 
		            catch (InterruptedException e) 
		            {
		                System.out.println(e);
		            }
		        }
		        
		        System.out.println("Main thread finished.");
		    }
		


	}


