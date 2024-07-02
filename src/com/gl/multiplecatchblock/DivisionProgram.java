package com.gl.multiplecatchblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.print("Enter the first integer: ");
	                int num1 = scanner.nextInt();

	                System.out.print("Enter the second integer: ");
	                int num2 = scanner.nextInt();

	                double result = divide(num1, num2);
	                System.out.println("Result of division: " + result);
	                break;

	            } catch (InputMismatchException e) {
	                System.out.println("Input mismatch. Please enter integers only.");
	                scanner.nextLine();

	            } catch (ArithmeticException e) {
	                System.out.println("Arithmetic exception: Division by zero is not allowed.");
	            }
	        }

	        scanner.close();
	    }

	    public static double divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Division by zero.");
	        }
	        return (double) dividend / divisor;
	    }
}
