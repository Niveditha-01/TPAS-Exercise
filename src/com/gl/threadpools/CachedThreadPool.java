package com.gl.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job implements Runnable {
	
    private int jobId;
    public Job(int id) 
    {
        this.jobId = id;
    }

    @Override
    public void run() {
        System.out.println("Job " + jobId + " started by thread: " + Thread.currentThread().getName());
        try 
        {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Job " + jobId + " completed by thread: " + Thread.currentThread().getName());
    }
}

public class CachedThreadPool {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) 
        {
            Job job = new Job(i);
            executor.submit(job);
        }

        executor.shutdown();
    }
}
