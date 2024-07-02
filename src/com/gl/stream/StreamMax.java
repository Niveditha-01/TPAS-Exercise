package com.gl.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMax {
	    public static void main(String[] args) {
	
	        List<Integer> numbers = Arrays.asList(412, 7, 2234, 100, 3215);

	        Optional<Integer> max = numbers.stream()
	                                       .max(Integer::compareTo);

	        if (max.isPresent()) 
	        {
	            System.out.println("Maximum element in the list: " + max.get());
	        } 
	        else
	        {
	            System.out.println("The list is empty.");
	        }
	    }
	}


