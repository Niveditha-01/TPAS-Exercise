package com.gl.demo;

import java.util.Scanner;

public class BirdCounting {
	public static int countTotalBirds(int rowNumber) {
		int a= 0;
		int b= 1;
		int total=0;
		for(int i = 1 ; i<=rowNumber;i++) {
			int c=a+b;
			a=b;
			b=c;
			total += c;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = sc.nextInt();
		BirdCounting.countTotalBirds(row);
		System.out.println(BirdCounting.countTotalBirds(row));
	}

}