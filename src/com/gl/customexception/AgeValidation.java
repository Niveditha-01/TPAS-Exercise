package com.gl.customexception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class AgeValidation {
	    
	    public static void validateAge(int age) throws InvalidAgeException {
	        if (age < 0 || age > 150) {
	            throw new InvalidAgeException("Age must be between 0 and 150.");
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter age: ");
	            int age = scanner.nextInt();
	            
	            validateAge(age);
	            
	            System.out.println("Valid age entered: " + age);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid age.");
	        } catch (InvalidAgeException e) {
	            System.out.println("Invalid age: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Something went wrong: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}

