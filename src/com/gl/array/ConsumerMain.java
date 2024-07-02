package com.gl.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsumerMain {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		List<Consumer> consumerList=new ArrayList<Consumer>();
		System.out.println("Enter the num of Consumers:");
		int n=Integer.parseInt(sc.nextLine());
		if(n<=0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		Consumer []consumerArr=new Consumer[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details:");
			String a = sc.nextLine();
			String arr[]=a.split(",");
			String id = arr[0];
			String name = arr[1];
			Integer unitConsumed = Integer.parseInt(arr[2]);
			Consumer consumer = new Consumer(arr[0],arr[1],unitConsumed,null);
			String amount = BillService.billCalcultion(consumer);
			consumer.setFinalPayment(amount);
			 consumerArr[i] = consumer;
			}
		String output = String.format("%-5s %-20s %-10s %-10s", "id","name","unitConsumed","finalPayment");
		System.out.println(output);
		for(Consumer c:consumerArr)
			System.out.println(c);
	 
			}
}