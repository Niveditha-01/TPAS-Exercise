package com.gl.java;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaAnonymus {
    public static void main(String[] args) {
	        BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {
	            @Override
	            public void accept(Integer a, Integer b) {
	                ((BiConsumer<Integer, Integer>) (a1, b1) -> System.out.println(a1 + b1)).accept(a, b);
	            }
	        };
	        biConsumer.accept(10, 5);

	        Comparator<String> c = new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                return ((Comparator<String>) (s1c, s2c) -> s1c.compareTo(s2c)).compare(s1, s2);
	            }
	        };
	    }
	}


