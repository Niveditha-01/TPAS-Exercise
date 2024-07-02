package com.gl.exceptionhanding;

import java.util.Scanner;

public class DivideNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the dividend (numerator): ");
	        int dividend = scanner.nextInt();

	        System.out.print("Enter the divisor (denominator): ");
	        int divisor = scanner.nextInt();

	        try {
	            int result = divide(dividend, divisor);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }

	        scanner.close();
	    }

	    public static int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Division by zero");
	        }
	        return dividend / divisor;
	    }
	}



