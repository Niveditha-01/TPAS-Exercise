package com.gl.chainedexception;

import java.util.Scanner;
	
class ConversionException extends Exception {	
    public ConversionException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}

	public class ConversionExceptionExample {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter an integer: ");
	            int number = Integer.parseInt(scanner.nextLine()); 
	            String convertedString = convertToString(number);
	            System.out.println("Converted integer to string: " + convertedString);

	        } catch (NumberFormatException e) {
	            System.out.println("Error: Input is not a valid integer.");

	        } catch (ConversionException e) {
	            System.out.println("Conversion Exception occurred: " + e.getMessage());
	            System.out.println("Original cause: " + e.getCause().getMessage());

	        } finally {
	            scanner.close();
	        }
	    }

	    public static String convertToString(int number) throws ConversionException {
	        try {
	            return String.valueOf(number);
	        } catch (NumberFormatException e) {
	            throw new ConversionException("Error converting integer to string", e);
	        }
	    }
}
