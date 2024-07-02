package com.gl.hashset;

import java.util.HashSet;

public class HashSet2 {
	
	    public static void main(String[] args) {
	        HashSet<Integer> set1 = new HashSet<>();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);

	        HashSet<Integer> set2 = new HashSet<>();
	        set2.add(3);
	        set2.add(23);
	        set2.add(5);
	        set2.add(6);

	        HashSet<Integer> intersection = new HashSet<>(set1);
	        intersection.retainAll(set2);
	        System.out.println("Intersection of set1 and set2: " + intersection);
	    }
	}



