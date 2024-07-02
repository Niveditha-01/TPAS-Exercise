package com.gl.hashset;

import java.util.HashSet;

public class HashSet3 {

	    public static void main(String[] args) {
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("BMW");
	        hashSet.add("Santro");
	        hashSet.add("Maruti");
	        hashSet.add("Audi");

	        String elementToCheck = "M";

	        if (hashSet.contains(elementToCheck)) {
	            System.out.println("Element '" + elementToCheck + "' exists in the HashSet.");
	        } else {
	            System.out.println("Element '" + elementToCheck + "' does not exist in the HashSet.");
	        }
	    }
	}



