package com.gl.functionalinterfce;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
	
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("phone", "laptop", "earphones", "mobile", "charger");
	        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
	        System.out.println("Sorted strings by length:");
	        strings.forEach(System.out::println);
	    }
}


