package com.gl.trycatchfinally;

import java.util.Scanner;

public class AverageCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        int count = 0;

	        System.out.println("Enter integers (enter 'done' to finish):");

	        while (true) {
	            String input = scanner.next();

	            if (input.equals("done")) {
	                break;
	            }

	            try {
	                int number = Integer.parseInt(input);
	                sum += number;
	                count++;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a valid integer or 'done' to finish.");
	                scanner.nextLine();
	            }
	        }

	        scanner.close();

	        if (count > 0) {
	            double average = (double) sum / count;
	            System.out.println("Average of entered numbers: " + average);
	        } else {
	            System.out.println("No valid numbers entered.");
	        }
	    }
}

	


