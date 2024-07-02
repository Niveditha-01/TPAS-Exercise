package com.gl.optional;

import java.util.Optional;

public class OptionalExample {

	    public static void main(String[] args) {
	    	
	        String nullableValue = "Hello";

	        Optional<String> optionalValue = Optional.ofNullable(nullableValue);

	        optionalValue.map(String::toUpperCase).ifPresent(System.out::println);

	        optionalValue.filter(value -> value.contains("H")).ifPresent(System.out::println);

	        optionalValue.map(String::length)
	                     .filter(length -> length > 5)
	                     .ifPresent(length -> System.out.println("Length is greater than 5"));
	    }
	}


