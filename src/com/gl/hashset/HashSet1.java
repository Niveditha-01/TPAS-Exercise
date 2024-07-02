package com.gl.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	    public static void main(String[] args) {
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("Lion");
	        hashSet.add("Tiger");
	        hashSet.add("Cat");
	        hashSet.add("Mouse");
	        hashSet.add("Girrafe");

	        System.out.println("Elements in the HashSet:");
	        Iterator<String> iterator = hashSet.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	    }
	}



