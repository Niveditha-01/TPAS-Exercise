package com.gl.throwingexceptions;

public class EmailValidator {
	    public static void main(String[] args) {
	        validateEmail("john.doe@example.com");   
	        validateEmail("invalid.email.com");      
	    }

	    public static void validateEmail(String email) {
	        if (!email.contains("@")) {
	            throw new IllegalArgumentException("Invalid email address: " + email);
	        }
	      
	}


}
