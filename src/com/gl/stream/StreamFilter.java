package com.gl.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
	        List<String> names = Arrays.asList("Apple", "Banana", "Cherry", "Dragon Fruit", "Kiwi", "Watermelon");

	        List<String> filteredNames = names.stream()
	                                         .filter(name -> name.startsWith("C"))
	                                         .collect(Collectors.toList());

	        System.out.println("Names starting with 'C':");
	        filteredNames.forEach(System.out::println);
	    }
	}


